package class23;

public class Task1 {

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(100,10);
        creditCard.calculateInterest();
        Visa visa=new Visa(100,10);
    }

}
class CreditCard{
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
       this.balance = balance;
        this.interest = interest;
   }

    public void calculateInterest(){
        System.out.println("Interest "+(balance*interest)/100);
    }
}

class Visa extends CreditCard{

    public Visa(double balance, double interest) {
        super(balance, interest);
    }
}

class  AX extends CreditCard{
    AX (double balance,double interest){
        super(balance,interest);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Interest "+(balance*interest/100)+30);
    }
}






