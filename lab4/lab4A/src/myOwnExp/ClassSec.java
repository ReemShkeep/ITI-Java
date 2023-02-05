/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myOwnExp;

/**
 *
 * @author mahmo
 */
public class ClassSec {
        public void Test() {
      MyOwnClass class1 = new MyOwnClass();
        try {
            class1.add();
            class1.sub();
            class1.sub();
        } catch (MyOwnExp e) {
            System.out.println(" MyException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}