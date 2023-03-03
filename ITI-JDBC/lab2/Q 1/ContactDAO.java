/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author salmamabrouk
 */
public class ContactDAO {
    
    private boolean isConnected = false;
    private final Connection connection;

    public ContactDAO(Connection c) {
        this.connection = c;
        isConnected = true;
    }

    public List<ContactPerson> getContacts() {

        List<ContactPerson> list = new ArrayList<>();

        if (isConnected) {
            try {
                String query = "select * from contacts";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    ContactPerson p = createContactPerson(resultSet);
                    list.add(p);
                }
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    public List<ContactPerson> getContactsByName(String name) {
        List<ContactPerson> list = new ArrayList<>();

        if (isConnected) {
            try {
                String query = "select * from contacts where name like '%" + name + "%'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    ContactPerson p = createContactPerson(resultSet);
                    list.add(p);
                }
                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    private ContactPerson createContactPerson(ResultSet rs) {
        ContactPerson p = new ContactPerson();
        try {
            p.setId(rs.getInt(1));
            p.setName(rs.getString(2));
            p.setNickName(rs.getString(3));
            p.setAddress(rs.getString(4));
            p.setHomePhone(rs.getString(5));
            p.setWorkPhone(rs.getString(6));
            p.setCellPhone(rs.getString(7));
            p.setEmail(rs.getString(8));
            p.setBirthDate(rs.getDate(9));
            p.setWebsite(rs.getString(10));
            p.setProfession(rs.getString(11));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return p;
    }

    public boolean insertContactPerson(ContactPerson cp) {
        System.out.println("lab1.ContactDAO.insertContactPerson()" + isConnected);
        if (isConnected) {
            try {
                String query = "INSERT INTO contacts(name,nick_name,address,home_phone,work_phone,cell_phone,email,birthday,website,profession) VALUES (?,?,?,?,?,?,?,?,?,?);";
                PreparedStatement statement = connection.prepareStatement(query);

                statement.setString(1, cp.getName());
                statement.setString(2, cp.getNickName());
                statement.setString(3, cp.getAddress());
                statement.setString(4, cp.getHomePhone());
                statement.setString(5, cp.getWorkPhone());
                statement.setString(6, cp.getCellPhone());
                statement.setString(7, cp.getEmail());
                statement.setDate(8, (Date) cp.getBirthDate());
                statement.setString(9, cp.getWebsite());
                statement.setString(10, cp.getProfession());

                if (statement.executeUpdate() != 0) {
                    System.out.println("Insertion Done");
                    return true;
                }

//                resultSet.close();
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    }

    public void testBatch() {
        if (isConnected) {
            try {
                String query1 = "UPDATE contacts SET email='test_email1@gmail.com' WHERE name='Test1'";
                String query2 = "UPDATE contacts SET email='test_email2@gmail.com' WHERE name='Test2'";
                String query3 = "UPDATE contacts SET email='test_email3@gmail.com' WHERE name='Test3'";
                
                connection.setAutoCommit(false);
                Statement statement = connection.createStatement();
                statement.addBatch(query1);
                statement.addBatch(query2);
                statement.addBatch(query3);

                int[] ExecuteBatch = statement.executeBatch();
                connection.commit();
                connection.setAutoCommit(true);
                statement.close();
                System.out.println("Update Queries Executed!");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                System.out.println("Update Queries Failed!");

            }
        }

    }

}