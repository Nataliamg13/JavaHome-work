package class11;

public class Example1 {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30},
                {40, 50, 60},
                {30, 40, 20, 10, 25}
        }; //Write a loop to print all the elements from this 2D Array.


        for (int i = 0; i < matrix.length; i++) {  //It shows the length of the row 1.

            // matrix[i].length the size of each 1D array
            for (int j=0;j< matrix[i].length; j++) {
                if(matrix[i][j]%2!=0) {   //modulus 2 is not equal with "0". Asa se pronunta.
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    }
}
