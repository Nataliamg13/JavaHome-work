package class10;

public class ProjectHomeWork4 {
    public static void main(String[] args) {
        //4) Create a 2D array or integer type where you will store odd and even numbers. Develop a program which
        // will identify/print the even numbers only.

        int [][] numbers={{1,12,22,24,},
                           {  8,2,4,7,5 },
                           { 72,12,85,3,6}};
         int i,j;

         for (i=0; i<5; i++) {
             for(j=0; j<3; j++) {
                 if(numbers[i][j]%2==0) {
                     System.out.println(numbers [i][j]+ " even numbers");
                 }
             }
         }
    }
}
