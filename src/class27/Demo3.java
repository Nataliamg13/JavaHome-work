package class27;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        //ArrayList is a class , and most of the methods are instance methods,
        // <datatype>
        ArrayList<String> names = new ArrayList<>();//we have created an array of String
        // add method to add elements to this ArrayList.
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Daria");
        names.add("Saba");
        System.out.println(names);
    }
}
