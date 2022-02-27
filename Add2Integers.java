/*
 * This programme computes the sum of 2 integers.
 */

 import java.util.Scanner;

 public class Add2Integers {
     public static void main(String[] args) {
         int num1, num2, sum; //Declaration of variables
         Scanner in = new Scanner(System.in); //Scans for keyboard input

         System.out.print("Enter 1st integer: "); //Prompt user input
         num1 = in.nextInt();
         System.out.print("Enter second integer: "); //Prompt user input
         num2 = in.nextInt();

         sum = num1 + num2; //Compute the sum
         System.out.println("The sum is: " + sum);
         System.out.println("Voila again!");
         in.close(); //Close the scanner
     }	
 }
 