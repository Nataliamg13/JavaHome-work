package class24;

public class FinalDemo {
    public static void main(String[] args) {
        final int num; //we have created a constant variable
        num=20;
        //num=30;    // not possible because the variable declare final
    }
    void noOneShouldOverrideIt(){
        System.out.println("This method should never be override otherwise it might break the code base");
    }
}
class Nelson extends FinalDemo{
    /* void noOneShouldOverrideIt (){  //can't override this method as it is declared as final
    System.out.println("Let me do that");
     */
 }