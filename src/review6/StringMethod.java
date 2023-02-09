package review6;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {


        String str = "Hello"; //Its a imutable ,you cant change the value of the String.
        System.out.println(str.length());   //5
        System.out.println(str.toUpperCase());  //HELLO
        System.out.println(str.charAt(1));   // e

        String newString=str.concat(" friends");
        System.out.println(newString); //Hello friends
        System.out.println(str);  //Hello
       str= str.toLowerCase();
        System.out.println(str); //hello

        //check if length of the String more than zero.
        boolean empty=str.isEmpty();
        System.out.println(empty);

        String str1="  Review  B15";
        str1.trim();


    }
}