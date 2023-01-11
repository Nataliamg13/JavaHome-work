package class6;

import java.util.Locale;
import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        //Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Country");
        String country = input.next();
        switch (country) {

            case "Moldova":
                System.out.println("Moldovian");
                break;
            case "Russian":
                System.out.println("Russian");
                break;
            case "Usa":
                System.out.println("English");
            default:

        }
    }
}