package pkg3;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Double []arr = new Double[3] ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        QuadraticEquation obj = new QuadraticEquation();
        obj.apply(arr);
        
    }
}
