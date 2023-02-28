package class30;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Person {

    //2) Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order. In that map store personId
    // and a Person Object. Print each object details.
    private String name, lastName;
    private int age, salary;

    Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }

    public static void main(String[] args) {

        Set<String> hset = new HashSet<String>();
        hset.add("first");
        hset.add("second");
        hset.add("third");
        hset.add("fourth");
        hset.add("fifth");
        String[] array = new String[hset.size()];
        Iterator<String> it = hset.iterator();
        int i = 0;
        while (it.hasNext()) {
            array[i] = it.next();
            i++;
        }

        System.out.println("HashSet contains: " + hset);
        System.out.println("Array elements: ");
        for (String s : array) {
            System.out.println(s);
        }

        Map<Integer, Person> personMap = new TreeMap<>();
        personMap.put(1222, new Person("John", "Smith", 23, 54000));
        personMap.put(1223, new Person("Brad", "Nile", 33, 62200));
        personMap.put(1224, new Person("Steve", "Black", 51, 90000));
        personMap.put(1225, new Person("Amogo", "Hernandez", 42, 100000));
        personMap.put(1226, new Person("Dan", "Pan", 18, 76000));
        Collection<Person> pers = personMap.values();
        for (Person people : pers) {
            people.getInfo();
        }

    }

}
