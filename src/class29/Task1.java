package class29;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
//1) Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
        ArrayList<String>  names=new ArrayList<>();
                              //Create an ArrayList that will store 5 names into it.
        names.add("Anush");
        names.add("Manshu");
        names.add("Kanshu");
        names.add("Panshu");
        names.add("Dananshu");

        System.out.println(names.isEmpty());//Find out whether the given ArrayList is empty or not?
        System.out.println(names.contains("Anush"));// Check whether the specific name is present in the ArrayList or not

        System.out.println(names.size()); //Find the size of your arrayList and print all values from that!!!
        System.out.println(names);



    }
}
