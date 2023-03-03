/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowset;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
/**
 *
 * @author salmamabrouk
 */
public class RowSet {

    public void getAllContacts() {
        Properties props = new Properties();
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\JDBCRowSet\\src\\jdbcrowset\\newproperties.properties");
            props.load(fis);
            JdbcRowSet rowset = RowSetProvider.newFactory().createJdbcRowSet();
            rowset.setUrl(props.getProperty("MYSQL_URL"));
            rowset.setUsername(props.getProperty("USER"));
            rowset.setPassword(props.getProperty("PASSWORD"));

            rowset.setCommand("SELECT * FROM contact");
            rowset.execute();
            while (rowset.next()) {
                System.out.println("ID: " + rowset.getInt("ID"));
                System.out.println("Name: " + rowset.getString("Name"));
                System.out.println("NickName: " + rowset.getString("NickName"));
                System.out.println("Address: " + rowset.getString("Address"));
                System.out.println("HomePhone: " + rowset.getString("HomePhone"));
                System.out.println("CellPhone: " + rowset.getString("CellPhone"));
                System.out.println("WorkPhone: " + rowset.getString("WorkPhone"));
                System.out.println("Email: " + rowset.getString("Email"));
                System.out.println("Birthdate: " + rowset.getDate("Birthdate"));
                System.out.println("Website: " + rowset.getString("Website"));
                System.out.println("Profession: " + rowset.getString("Profession"));
                System.out.println("\t");
            }

        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        } catch (IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        RowSet rs = new RowSet();
        rs.getAllContacts();

    }
}