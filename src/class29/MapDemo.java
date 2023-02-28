package class29;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
              // -KEY-  -VALUE-
       // HashMap<String,Integer> groceries=new HashMap<>();
        //LinkedHashMap<String ,Integer> groceries=new LinkedHasMap<>();
        TreeMap<String ,Integer> groceries=new TreeMap<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        System.out.println( groceries.isEmpty());// TRUE OR FALSE IF ITS EMPTY
        System.out.println(groceries.size());  //IT WILL PRINT THE SIZE OF Array

        groceries.remove("Meat");
        System.out.println(groceries);


    }
}
