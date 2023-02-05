/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3c;

import java.util.function.Function;

/**
 *
 * @author mahmo
 */
public class innerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        float x = 24;

//    float out = new java.util.function.Function<Float, Float>() {
    float out = new Function<Float, Float>() {
      @Override
      public Float apply(Float t) {
        return t * 9 / 5 + 32;
      }
    }.apply(x);

    System.out.println("Temp is =  " + x + " C or " + out + " F");
    }
    
}
