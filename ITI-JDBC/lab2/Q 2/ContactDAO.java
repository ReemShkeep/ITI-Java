/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbgui;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author salmamabrouk
 */
public class ContactDAO {
    
    private boolean conflag = false;
    private Connection c;
    
    public static MysqlDataSource getMYSQLDataSource()
    {
        Properties props = new Properties();
        FileInputStream fis;
        MysqlDataSource mysqlDS= new MysqlDataSource();
        try{
            fis=new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\JDBCOne\\src\\jdbcone\\newproperties.properties");
            props.load(fis);
            mysqlDS.setURL(props.getProperty("MYSQL_URL"));
            mysqlDS.setUser(props.getProperty("USER"));
            mysqlDS.setPassword(props.getProperty("PASSWORD"));
        }catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        return mysqlDS;
    }

    public Connection Connect() throws SQLException {

        conflag = true;
        c=getMYSQLDataSource().getConnection();
        System.out.println("Connection Established");
        return c;

    }

    public ArrayList<ContactPerson> Select() {

        ArrayList<ContactPerson> arr = new ArrayList();

        try {
            
            String query = "SELECT * FROM contact";
            Statement stmt2 = c.createStatement();
            ResultSet r = stmt2.executeQuery(query);
            while (r.next()) {
                ContactPerson p = new ContactPerson(r.getInt("id"), r.getString("name"), r.getString("nick_name"), r.getString("address"), r.getString("home_phone"), r.getString("work_phone"), r.getString("cell_phone"), r.getString("email"), r.getDate("birthday"),
                        r.getString("web_site"),
                        r.getString("profession")
                );

                arr.add(p);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return arr;
    }

    public void Insert(ContactPerson newp) {
        if (conflag) {
            try {
                String query = "INSERT INTO contact(id, name, nick_name, address, home_phone, work_phone, cell_phone, email, birthday, web_site, profession) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement newstmt = c.prepareStatement(query);
                newstmt.setInt(1, newp.getId());
                newstmt.setString(2, newp.getName());
                newstmt.setString(3, newp.getNickName());
                newstmt.setString(4, newp.getAddress());
                newstmt.setString(5, newp.getHomePhone());
                newstmt.setString(6, newp.getWorkPhone());
                newstmt.setString(7, newp.getCellPhone());
                newstmt.setString(8, newp.getEmail());
                newstmt.setDate(9, newp.getBD());
                newstmt.setString(10, newp.getWebsite());
                newstmt.setString(11, newp.getProfession());
                newstmt.execute();
                System.out.println("Row Inserted!");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void Update() {
        Statement s;
        if (conflag) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter Column Name to be Updated in (id, name, nick_name, address, home_phone, work_phone, cell_phone, email, birthday, web_site, profession): ");
            String UpdateColName = s1.nextLine();
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter Column Value you want to update: ");
            String UpdateColValue = s2.nextLine();
            Scanner s3 = new Scanner(System.in);
            System.out.println("Enter Column Name you want to update in (id, name, nick_name, address, home_phone, work_phone, cell_phone, email, birthday, web_site, profession)");
            String ColName = s3.nextLine();
            Scanner s4 = new Scanner(System.in);
            System.out.println("Enter Column Value to be Updated: ");
            String ColValue = s4.nextLine();

            try {

                String uquery = "UPDATE contact set " + UpdateColName + "='" + UpdateColValue + "' where " + ColName + "='" + ColValue + "'";
                s = c.createStatement();
                s.execute(uquery);
                System.out.println("Row Updated!");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void DeletefromTable() {
        Statement s;
        if (conflag) {

            Scanner colName = new Scanner(System.in);
            System.out.println("Enter Column Name you want to delete in (id, name, nick_name, address, home_phone, work_phone, cell_phone, email, birthday, web_site, profession)");
            String col = colName.nextLine();
            Scanner colValue = new Scanner(System.in);
            System.out.println("Enter Column Value to be deleted: ");
            String value = colValue.nextLine();

            try {

                String uquery = "DELETE FROM contact WHERE " + col + "='" + value + "' ";
                s = c.createStatement();
                s.execute(uquery);
                System.out.println("Row Deleted!");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void closeConnection() {
        try {
            c.close();
            conflag = false;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
