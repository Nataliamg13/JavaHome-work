package HM28;
import java.util.ArrayList;
import java.util.Collections;

public class ArrNum {
    public static void main(String[] args) {
//5)Create an arrayList of even numbers from 1 to 500.
// Remove any number that is divisible by 5 from that arrayList.

        ArrNum evenNumbers = new ArrNum();
        for (int i = 0; i <= 500; i += 2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
       // evenNumbers.removeIf(n -> n % 5 == 0);
        System.out.println(evenNumbers);
    }

    private void removeIf(Object o) {
    }

    private void add(int i) {

    }

}