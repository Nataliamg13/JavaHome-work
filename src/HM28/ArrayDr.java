package HM28;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayDr {
    public static void main(String[] args) {
//4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Stella Rossa");
        drinks.add("Champaign");
        drinks.add("Smirnoff");
        drinks.add("Wine");
        drinks.add("Kagor");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("e") || drink.contains("a")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);

        drinks.replaceAll(drink -> drink.contains("a") || drink.contains("e") ? "Water" : drink);
        System.out.println(drinks);
    }}