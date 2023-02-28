package class30;

import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annadale");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
