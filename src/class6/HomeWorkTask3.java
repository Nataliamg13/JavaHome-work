package class6;

import java.util.Scanner;

public class HomeWorkTask3 {
    public static void main(String[] args) {

        //HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers
        // and operator(+,-,*,/). Based on operator provide the result to user. (edited)
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter two numbers");
        num1=input.nextInt();
        num2=input.nextInt();
        System.out.println("Enter this operators(+ ,-, *, /)");
        char operator =input.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println((num1+num2));
                break;
            case '-':
                System.out.println((num1-num2));
                break;
            case '*':
                System.out.println((num1*num2));
                break;
            case '/':
                System.out.println((num1/num2));
                break;
            default:
        }
    }
}
