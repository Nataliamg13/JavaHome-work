package class12;
import java.util.Scanner;
public class TaskHM3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
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
            System.out.println(moms.substring(0,2)+dads.substring(3,6));
        }

    }}

