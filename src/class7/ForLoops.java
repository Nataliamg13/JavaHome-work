package class7;

public class ForLoops {
    public static void main(String[] args) {

        /*
        print number from 0 to 9
         */
        int number=0; // creating a variable of type int
        while (number<10){  // checks the condition if condition is true execute the code in the body of while loops

            System.out.println(number); //prints the value of number in console
            number++; //(++)it adds  one to the number variable
        }
        /*
        (initialize ; condition ;increment-Decrement).
         */

/*
        for(int i=0; i<10; i++){
            System.out.println(i);*/
        for(int i=1; i<20; i+=2){    ////using a for loop print odd numbers from 1-20.
            System.out.println(i);
        }
        }/*//for(int i=1; i<=20; i++){   ////same problem different cod.
            if(i%2!=0){
        System.out.println(i);*/
    }

