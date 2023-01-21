package class10;

import java.util.Arrays;
import java.util.Scanner;

public class Project1HomeWork2 {
    public static void main(String[] args) {
        //Using Scanner create an array of countries. When an array is created, retrieve all values from
       // it and while retrieving those values print capital for each country.
        Scanner scan=new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String[] countries = new String[5];
        String[] cities = new String[5];

        int numCountry=1;
        int numCity=1;

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Enter country number "+numCountry+" :");
            numCountry++;
            countries[i] = scanner.nextLine();

        }for (int j = 0; j < cities.length; j++) {
            System.out.println("Enter the corresponding  capital to country number "+numCity+" :");
            numCity++;
            cities[j] = scanner.nextLine();

        }
        System.out.println();
        System.out.println("Countries List: "+Arrays.toString(countries));
        System.out.println("Cities List: "+ Arrays.toString(cities));
    }


}








