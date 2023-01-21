package class10;

import java.util.Arrays;

public class ForEachLoopDemo4 {
    public static void main(String[] args) {

     //4) Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.
        int [] arr={8,12,15,22,25,35,40};

        for (int i=0;i<arr.length; i++){
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }

    }
}
