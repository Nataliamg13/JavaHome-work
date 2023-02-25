package HM28;

import java.util.ArrayList;

public class ArrList {
        //1) Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that

    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Nat");
        arrList.add("Asli");
        arrList.add("Dena");
        arrList.add("Daria");
        arrList.add("Abeera");

        System.out.println(arrList.isEmpty());
        System.out.println(arrList.contains("Asli"));
        System.out.println(arrList.size());
        System.out.println(arrList);

        }
    }


