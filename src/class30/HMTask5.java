package class30;

import java.util.ArrayList;
import java.util.List;

public class HMTask5 {

    public static void main(String[] args) {
      //5)Create a collection of integers in which you can keep duplicates.
        //Write a logic to find sum of all integers (edited)
        List<Integer> numbers=new ArrayList<>();
        numbers.add(15);
        numbers.add(22);
        numbers.add(45);
        numbers.add(22);
        numbers.add(75);
        int sum=0;
        for (Integer number : numbers) {
            sum=sum+number;
        }
        System.out.println(sum);
    }
}


