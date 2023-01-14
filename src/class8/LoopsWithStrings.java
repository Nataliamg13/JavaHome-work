package class8;
import java.util.Scanner;
public class LoopsWithStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("PLEASE enter your name");
        while (scanner.next().equalsIgnoreCase("Sha")) {
            System.out.println("Great student who always wanted an example with Strings in loop");
        }

    }
}
