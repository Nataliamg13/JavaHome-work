package class11;

import java.util.Arrays;

public class ExampleEnhanceForLoop {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {40, 50, 60},
                {30, 40, 20, 10, 25}
        };
        // for each loop to print all the numbers from a 2D Array.
        for (int[] arr:matrix) {
            for (int number:arr) {
                System.out.println(number+" ");
            }
            System.out.println();
        }
        }
    }

