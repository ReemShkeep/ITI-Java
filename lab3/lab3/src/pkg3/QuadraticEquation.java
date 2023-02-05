
package pkg3;

import java.util.function.Function;

public class QuadraticEquation implements Function<Double[],Void>{

    private double r1,r2, d;
    
    @Override
    public Void apply(Double [] arr ) {
        
        d = arr[1] * arr[1] - 4.0 * arr[0] * arr[2];
        if (d > 0.0) {
             r1 = (- arr[1] + Math.pow(d, 0.5)) / (2.0 *  arr[0]);
             r2 = (- arr[1] - Math.pow(d, 0.5)) / (2.0 *  arr[0]);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        
        else if (d == 0.0) {
            r1 = - arr[1] / (2.0 *  arr[0]);
            System.out.println("The root is " + r1);
        } 
        
        else {
            System.out.println("Roots are not real.");
        }
        return null;

    }



    
}
