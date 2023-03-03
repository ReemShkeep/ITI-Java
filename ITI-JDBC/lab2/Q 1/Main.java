/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author salmamabrouk
 */
public class Main {

      public static MysqlDataSource getMysqlDataSource() {
        Properties props = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("M:\\private ITI\\labs\\Java_JDBC\\Day2\\src\\Day2\\DBProp.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
        MysqlDataSource mysqlDS = new MysqlDataSource();
        try {
            props.load(fis);
            mysqlDS.setURL(props.getProperty("HOST"));
            mysqlDS.setUser(props.getProperty("USER"));
            mysqlDS.setPassword(props.getProperty("PASS"));

            if (mysqlDS.getConnection() != null) {
                System.out.println("lab2.ContactDAO.Connect() ");
            }
        } catch (IOException | SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return mysqlDS;
    }

    public static void main(String[] args) {
        try {
            java.sql.Connection connection = Lab2.getMysqlDataSource().getConnection();
            if (connection != null) {
                System.out.println("Connection Done");
                ContactDAO cDAO = new ContactDAO(connection);
                List<ContactPerson> list = cDAO.getContacts();
                cDAO.testBatch();
                new GUI().Begin(list);
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
Footer
