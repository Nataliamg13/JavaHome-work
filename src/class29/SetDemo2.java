package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        //Does not allow the duplicate and retains the intersection order
        LinkedHashSet<String>  fruit=new LinkedHashSet<>();
        fruit.add("Kiwi");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}
