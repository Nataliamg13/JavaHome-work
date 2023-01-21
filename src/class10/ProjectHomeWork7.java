package class10;

import java.util.Scanner;

public class ProjectHomeWork7 {
    public static void main(String[] args) {
        //7)Write a java program to check whether a given number is prime or not?
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        boolean Prime = true;
        if (num > 0) {
            for (int i = 2; i * i < num; i++) {
                if (num % 2 == 0) {
                    Prime = false;
                }
            }
            if (Prime) {
                System.out.println("This number " + num+" is Prime");
            } else {
                System.out.println("This number " + num+" is not Prime");

            }
        }
    }
}




