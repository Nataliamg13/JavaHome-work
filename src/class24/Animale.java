package class24;

public  abstract class Animale {
   //  int age;



    abstract void speak();
    void sleep(){
        System.out.println("Animals sleep 5 to 8 hours a day");
    }
}
class Dog extends Animale{
    @Override
    void speak() {
        System.out.println("WUFF WUFF");
    }
}
abstract class Cat extends Animale{
    @Override
    void speak() {
        System.out.println("Meow meow");
    }
}