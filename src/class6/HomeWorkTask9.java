package class6;

import java.util.Scanner;

public class HomeWorkTask9 {
    public static void main(String[] args) {
        //Write a program for user to enter his/hers birth month. Based on the month define the season.
        //Example: if user is born in June, July or August → season =”Summer”.
        //At the end of the program we should see output as “You were born __”.
        Scanner season =new Scanner(System.in);
        System.out.println("Which month is your birthday ");
        String month=season.nextLine();

        switch (month){
            case "December":
            case "January":
            case "February":
                System.out.println("Your birthday is in winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Your birthday is in spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Your birthday is in summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Your birthday is in autumn");
                break;
            default:
        }
    }
}
