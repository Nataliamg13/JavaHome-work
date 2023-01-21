package class10;

import java.util.Scanner;

public class ProjectHomeWork5 {
    public static void main(String[] args) {
         //5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd
        // numbers for that array.

        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }
        System.out.println("Sum of Odd numbers = " + oddSum);
        System.out.println("Sum of Even numbers = " + evenSum);
    }
}


