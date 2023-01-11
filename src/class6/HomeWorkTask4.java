package class6;
import java.util.Scanner;
public class HomeWorkTask4 {
    public static void main(String[] args) {

        // Write a program to find largest of three double values using if-else..if and
        // logical operators provided by a user (numbers must be distinct)
        Scanner scanner =new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Please enter three numbers");
        num1 =scanner.nextInt();
        num2 = scanner.nextInt();
        num3 =scanner.nextInt();                     // Problema aceasta e legata oliaca de Task 5.

        if (num1 >num2 && num1>num3) {
            System.out.println("The Largest Number is " + num1);
        }else if (num2 >num3 && num2>num3) {
            System.out.println("The largest number is " + num2);
        }else if (num3 > num2 && num3 > num1) {
            System.out.println("The largest number is "+ num3);
        }





    }
}
