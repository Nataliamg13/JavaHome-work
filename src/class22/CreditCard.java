package class22;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will
    // calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    int balance;
    double interest;
    double CalcInt(){

        int balance=10000;
        double interest=7;

        return(interest/12)*balance;
    }
}
class Visa extends CreditCard{
    double CalcInt(){
        return(interest/12)*balance;
    }
}
class AX extends CreditCard{
    @Override
    double CalcInt() {
        interest=9.00;
        balance=5000;
        return (interest/12)*balance;
    }
}
class CreditCardTester{
    public static void main(String[] args) {
        CreditCard x=new CreditCard();
        System.out.println(x.CalcInt());
        Visa v=new Visa();
        System.out.println(x.CalcInt());
        AX ax=new AX();
        System.out.println(ax.CalcInt());


    }
}