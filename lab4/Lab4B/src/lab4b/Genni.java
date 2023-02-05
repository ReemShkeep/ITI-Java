/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4b;

import java.util.ArrayList;
import java.util.List;






/**
 *
 * @author mahmo
 */
public class Genni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test newshape = new Test();
        
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        
        ArrayList<Shape> shapes = new ArrayList<>();
        
        
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
        rectangles.add(new Rectangle());
     Rectangle  newrect=new Rectangle();
     
 shapes.add(newrect);
 
 
        
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());
        circles.add(new Circle());
        
        newshape.testDraw(rectangles);
        newshape.testDraw(circles);
        
      newshape.testDraw(shapes);

    }
    
}
