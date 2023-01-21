package class11;

public class Example {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {40, 50, 60},
                {30, 40, 20, 10, 25}
        }; //Write a loop to print all the elements from this 2D Array.


        for (int i = 0; i < matrix.length; i++) {  //It shows the length of the row 1.

            // matrix[i].length the size of each 1D array
            for (int j=0;j< matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
