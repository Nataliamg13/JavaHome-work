package review6;

public class MoreStringMethods {
    public static void main(String[] args) {

        String myString="Hello is February 2";

      String [] strArray=myString.split(" ");

      for(String s:strArray) {
          System.out.println(s);
      }
        System.out.println("______________");
        System.out.println(myString);
        myString.substring(9);

        String newStr = myString.substring(9, 17);
        System.out.println(newStr);

        int index=newStr.indexOf('b');
        System.out.println("Index of character b is = "+index);

        String anotherStr="Today is Thursday";

    }
}
