package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
       /* String str="  KLMNKHdc452ccr87453**(&&(())";
        System.out.println(str.replaceAll("[A-K]","#"));//We are specifying a pattern.
                                             //It will replace with the'#' instead the UpperCase
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z]","#"));
                                        //UpperCase and LowerCase letter only in this thing will be replace.
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
                                  //DO NOT REPLACE THE UPPER-LOWER-NUMBERS"^^^^^" This is the "Not"like "!"

        */
        String str="kJDKJDZLMNOPFj452nfjdnf384834%^&((()";
        //replaces All upper case letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        //replaces All lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]","#"));
        //replaces All lower case letters from 0 to 9
        System.out.println(str.replaceAll("[0-9]","#"));
        //replaces All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //replaces All lower case letters from A-Z and lower case letters from a-z and numbers as well
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        //Do not replace All lower case letters from A-Z and lower case letters from a-z
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));

        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));// "" empty ""will leave the code empty

    }
}