package class10;
import java.util.Scanner;
public class Project1HomeWork {
    public static void main(String[] args) {
        //1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all
        // stored elements in that array.
       int [] num={10,30,50,75};
       int sum=0;

        for (int i = 0;i< num.length ; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
