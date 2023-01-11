package class6;

public class HomeWork7 {
    public static void main(String[] args) {

        //Print odd numbers between 20 and 50 (2 ways)


        int number1 = 20;  /////odd numbers
        while (number1 < +50) {
            System.out.println(number1);
            number1 += 3;
        }
        System.out.println("Second example=====");


        int number2 = 20;  // Its start with "0" ____odd numbers
        while (number2 < 50) {
            System.out.println(number2);
            number2 += 3;  // to jump in 2 numbers.
        }
    }
}