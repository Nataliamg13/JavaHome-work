package class15;

public class DodTester {
    public static void main(String[] args) {
        System.out.println("Start");
        Dog dog=new Dog();
        dog.printFood();
        System.out.println("End");
        System.out.println(Dog.noOfLegs);

        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
        //System.out.println(i); //can't use outside of block
    }
}
