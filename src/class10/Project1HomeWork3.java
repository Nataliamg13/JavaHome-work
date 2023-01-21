package class10;

public class Project1HomeWork3 {
    public static void main(String[] args) {
        //3) Create a 2D array of integer values. Print the sum of all numbers.
        int[][] matrix = {{10, 15, 20, 25},
                {12, 35, 45, 75},
                {24, 84, 12, 50}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum =sum+ matrix[i][j];
            }

        }
                    System.out.println("Sum " + sum);

        }

    }


