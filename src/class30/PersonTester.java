package class30;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class PersonTester {
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

            personMap.put(1222, new Person("John", "Smith", 25, 54000));
            personMap.put(1223, new Person("Vasile", "Petrovichi", 31, 62200));
            personMap.put(1224, new Person("Ioana", "Dragomir", 22, 90000));
            personMap.put(1225, new Person("Fedia", "Fedotov", 27, 100000));
            personMap.put(1226, new Person("Daniela", "Moldoveanca", 19, 76000));
    Collection<Person> p = personMap.values();
            for (Person people : p) {
        people.getInfo();


    }}}

