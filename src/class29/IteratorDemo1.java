package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
       numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);


        /*for (Double number:numbers){      // if the IntelliJ is yellow , something is fundamental wrong!!!
           // System.out.println(number);

                                        //overloaded

           // if(number>11){   /*                      //C:\Users\natal\.jdks\corretto-17.0.5\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=53503:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\natal\IdeaProjects\SDETBatch15\out\production\SDETBatch15 class29.IteratorDemo1
                Exception in thread "main" java.util.///////ConcurrentModificationException///////  because this enhance for loop is static that's why we cant change it, and
                                                                 will create error because is doing 2 operation at the same time but cant work correct.
                at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
                at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
                at class29.IteratorDemo1.main(IteratorDemo1.java:17)

                Process finished with exit code 1*/

               // numbers.remove(number);
          //  }
                                      //ITS CALLED LAMBA ERRAY!!!
                   //numbers.removeIf(number  ->  number>11);


                  //System.out.println(numbers);  */
           Iterator<Double> iterator= numbers.iterator();
           /*
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(numbers);
*/
               //hasNext() keep on returning true as long as there are elements left to be iterated
        while (iterator.hasNext()) {

       double number= iterator.next();
       if(number>11){
           iterator.remove();
       }
        }
        System.out.println(numbers);
    }


    }

