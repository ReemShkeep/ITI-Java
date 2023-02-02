import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        System.out.println("You entered: " + num);
//- Perform a calculation
         System.out.println("Enter a number: ");
         int num2 = input.nextInt();
         System.out.println("You\'ve entered: " + num2);
         System.out.println("The sum of the two numbers is: " + (num + num2));
// - Receives two inputs a number and a string and prints the string on different lines according to the number
         System.out.println("Enter a number: ");
         int num3 = input.nextInt();
         System.out.println("Enter a string: ");
         String str = input.next();
         for (int i = 0; i < num3; i++) {
             System.out.println(str);
         }

    }


}

