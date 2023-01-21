package class10;

import java.util.Scanner;

public class ProjectHomeWork8 {
    public static void main(String[] args) {

        //8)Write a Java Program to print the first 10 numbers of Fibonacci series.

        int num =0;
        int x=0;
        int y=0;
        int z=1;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a num from 1 to 10.");
        num=scan.nextInt();
        System.out.println("Fibonacci series :");
        for(int i=0;i<+num;i++) {

            x=y;
            y=z;
            z=x+y;
            System.out.print(x+" ");
        }

    }
}
