package class11;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {40, 50, 60},
                {1, 2, 3, 4, 5, 6, 7}};

        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[0][i]);
        }
        int[] arr = matrix[0];
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
