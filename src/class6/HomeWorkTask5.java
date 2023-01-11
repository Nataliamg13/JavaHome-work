package class6;

import java.util.Scanner;

public class HomeWorkTask5 {
    public static void main(String[] args) {
        //)Write a program to find largest number among three numbers using nested if provided
        // by a user (numbers must be distinct)
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter (nested) 3 numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if(num1>num2){
            if(num1>num2){
                System.out.println("The Largest number is " +num1);
            }
        }
      if (num2>num1){
           if(num2>num3){
        System.out.println("The Largest number is " +num2);

    }
}
     if (num3>num1) {
         if(num3>num2){
             System.out.println("The Largest number is " +num3);
         }
     }

    }
}
