package class11;

import java.util.Scanner;

public class PhoneTester {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       Phone phone1=new Phone ();
       Phone phone2=new Phone ();
       Phone phone3=new Phone ();

       phone1.type="Cellphone";
       phone1.brand="Iphone";
       phone1.provider="T-Mobile";
       phone1.color="Gold";

        phone2 .type="Pixel";
        phone2 .brand="Google";
        phone2 .provider="Sprint";
        phone2 .color="Green";

        phone3 .type="Samsung";
        phone3 .brand="Android";
        phone3 .provider="Verizon";
        phone3 .color="Pink";

        System.out.println("My Phone is "+ phone1.type+" ,"+phone1.brand+" with provider "+phone1.provider+" nice "+ phone1.color+" color");
        System.out.println("My Phone is "+ phone2.type+" ,"+phone2.brand+" with provider "+phone2.provider+" nice "+ phone2.color+" color");
        System.out.println("My Phone is "+ phone3.type+" ,"+phone3.brand+" with provider "+phone3.provider+" nice "+ phone3.color+" color");


    }
}
