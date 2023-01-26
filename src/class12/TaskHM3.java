package class12;
import java.util.Scanner;
public class TaskHM3 {
    public static void main(String[] args) {
        //) Write a program that reads two people's first
        //        names and if they expecting boy or girl?
        //                Based on the input suggests a name for a baby:
        //        Example Output:
        //        Mom’s first name? Mary
        //        Dad’s first name? Daniel
        //        Boy or Girl? boy
        //        Suggested baby name: DANRY
        //
        //        Example Output:
        //        Mom’s first name? Mary
        //        Dad’s first name? Daniel
        //        Boy or Girl? girl
        //        Suggested baby name: MAIEL


      /*  Scanner scan=new Scanner(System.in);
        System.out.println("Please enter mom's name");
        String moms= scan.next();
        System.out.println("Please enter dad's name");
        String dads= scan.next();
        System.out.println("Are you expecting a boy or a girl?");
        String gender=scan.next();
        if(gender.equals("B")){
            System.out.println(dads.substring(0,3)+moms.substring(2,4));
        }
        if (gender.equals("G")) {
            System.out.println(moms.substring(0,2)+dads.substring(3,6)); }*/



        String dadsName="Zafar";
        String momsName="Maryum";
        String expectation="Boy";
        String firstHalf="";
        String secondHalf="";

        if(expectation.equalsIgnoreCase("boy")) {
             firstHalf = dadsName.substring(0, dadsName.length() / 2);  //first index starts with"0"
             secondHalf = momsName.substring(momsName.length() / 2);

        }else {
            firstHalf = momsName.substring(0, momsName.length() / 2);
            secondHalf = dadsName.substring(dadsName.length() / 2);
        }
            System.out.println(firstHalf+secondHalf);

    }}

