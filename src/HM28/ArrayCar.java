package HM28;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCar {
    public static void main(String[] args) {
//2)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Chrysler");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " ");
        }
        System.out.println();
        for (String x : cars) {
            System.out.print(x + " ");
        }
        System.out.println();
        int i = 0;
        while (i < cars.size()) {
            System.out.print(cars.get(i) + " ");
            i++;

        }
    }
}