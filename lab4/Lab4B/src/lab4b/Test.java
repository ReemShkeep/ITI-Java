/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahmo
 */
public class Test {
    public  void testDraw(ArrayList<? extends Shape > shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
