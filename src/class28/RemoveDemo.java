package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

/*
        Iterator<String> iterator= words.iterator(); //this is a method, it will return us a

        while (iterator.hasNext()){
            String s= iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }*/

        //this is a method, it will return us a
        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);
    }

    }

