/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;


import java.sql.*;

/**
 *
 * @author salmamabrouk
 */


public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactDAO c1 = new ContactDAO();
        System.out.println("DB!");
        try {
            c1.Connect();
        } catch (SQLException s) {
            System.out.println(s.getMessage());
        }

        ContactPerson p = new ContactPerson();

        p.setId(12);
        p.setName("mai");
        p.setNickName("dude");
        p.setAddress("NasrCity");
        p.setHomePhone("4568788");
        p.setCellPhone("333");
        p.setWorkPhone("0098799");
        p.setEmail("mai@gmail.com");
        p.setWebSite("dude.com");
        p.setProfession("suffering..");

        c1.Insert(p);

        c1.Select().forEach((s) -> {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getNickName());
        });

        c1.closeConnection();

    }
}
