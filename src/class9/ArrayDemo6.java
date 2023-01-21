package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //Create an empty array then store 45 44 33 20 and 10 in it   then use a loop to add all the elements which are
        // present on even indexes and print it after adding them

        //create an array and store 10,20,30,4,5,6,7,80
        //add all the element which are multiple of 2

        int[] numbers = new int[5];
        numbers[0] = 45;  //45+0=45
        numbers[1] = 44;
        numbers[2] = 33;  //45+33=78
        numbers[3] = 20;
        numbers[4] = 10;  //78+10=88

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);  //sum =88.

        System.out.println("again checking");


        int[] numerele = {10, 20, 30, 4, 5, 6, 7, 80};
        int sum1 = 0;
        for (int i = 0; i < numerele.length; i++) {

            if (numerele[i] % 2 == 0) {
                sum1 = sum1 + numerele[i];
            }
        }
        System.out.println(sum1);

        System.out.println("&&&&&&&&&&&&&");
        int []  arr = {10, 20, 30, 4, 5, 6, 7, 80};
            int sum2=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                sum2 =sum2+arr[i];
            }
        }
            System.out.println(sum2);
        }

    }

