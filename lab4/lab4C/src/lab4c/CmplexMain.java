/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4c;






/**
 *
 * @author mahmo
 */
public class CmplexMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoubleComplex dp1 = new DoubleComplex(3.0,5.0);
        DoubleComplex dp2 = new DoubleComplex(2.0,3.0);
        
        System.out.println(dp1.add(dp2).toString());
        System.out.println(dp1.sub(dp2).toString());
        System.out.println(dp1.mul(dp2).toString());
        System.out.println(dp1.div(dp2).toString());
      
    }
    
}
