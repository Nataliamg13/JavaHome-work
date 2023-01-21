package class11;

public class HMSum {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers


        int sum=0;
        int [][] num={{12,3,5,},
                {8,10,6},
                {20,75,95}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                sum =sum+num[i][j];
            }}
            System.out.println("The Total is "+sum);
        }
    }

