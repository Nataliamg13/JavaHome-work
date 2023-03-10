package class30;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HMTask3 {
    //3)Create a Map that will store Employee name and salary.
    // Write a logic to retrieve an employee who gets the highest salary. Output should
    // be in the below format
    //John Smith=$100000

    public static void main(String[] args) {
       Map<String, Integer> employMap = new HashMap<>();

       employMap.put("John  Smith", 100000);
       employMap.put("Ioana", 99000);
       employMap.put("Vasile", 34000);
       employMap.put("Fedia", 90520);
       employMap.put("Tolea", 93400);
       System.out.println(employMap);
    }
}