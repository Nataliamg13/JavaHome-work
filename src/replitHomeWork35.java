import java.util.Scanner;

public class replitHomeWork35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you need a loan?");

        boolean loan = scan.nextBoolean();
        if (loan==true){
        System.out.println("What is your credit score?");
        int score = scan.nextInt();
        if (score < 600) {
            System.out.println(" The Eligibility is Not eligible");
            }else if (score >= 600 && score < 700) {
                System.out.println(" The Eligibility is Maybe eligible");
            } else if (score >= 700 && score <= 800) {
                System.out.println(" The Eligibility is Eligible");
            } else if (score > 800) {
                System.out.println(" The Eligibility is Definitely eligible");
            }
        }else {
            System.out.println("Unknown");
        }
}

    }
