package class8;
import java.util.Scanner;
public record HomeWork2class() {
    public static void main(String[] args) {
        //2) Create a program that will be asking user to apply for a credit card 10 times. As soon you
        // get an “yes” from a user program should stop asking.
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Do you want a credit card");
            String userResponse=scanner.next();
            if(userResponse.equalsIgnoreCase("yes")) {
                break;
            }
        }


    }
}
