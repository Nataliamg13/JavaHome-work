package class6;

public class HomeWork9 {
    public static void main(String[] args) {

        //Print numbers from 1 to 100 in 1 line with space
      /*  int number = 1;
        printNumbers(number);
    }

    public static void printNumbers(int num) {
        if (num <= 100) {
            System.out.print(num + " ");
            printNumbers(num + 1);
            */


        for ( int i=1; i <= 100; i++) {
            System.out.print(", "+i);
        }
    }
}