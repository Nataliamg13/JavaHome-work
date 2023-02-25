package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

        ArrayList<String> name=new ArrayList<>();  //GENERIC AS PER JAVA.

        name.add("10");

      /*
        Object a=new String("same value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);
                                                    //This is NONGENERIC Type how it use to be , VERY Bad Mix of
                                                    data type , very confusing and disorganised !!!
                                                    Before 2004.
        ArrayList name=new ArrayList();
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        Object unknow;
        name.add(new Dog("Jacky","Green,"unknow"));


                for (Object j:name
        ){
            ((String)j).trim();
            System.out.println(j);
        }
*/

    }
}
