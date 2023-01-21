package class10;

import java.util.Scanner;

public class ProjectHomeWork9 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array?
        int[] nums = { 12, 9, 4, 7, 25, 8 };
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > max) {
                max = nums[i];
            }
            else if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("The minimum  number in array  is " + min);
        System.out.println("The maximum number in array is " + max);
    }
    }
