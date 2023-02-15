package class24;

public class Animal {
    void speak(){
        System.out.println("Animal can speak");
    }
    void eat(){
        System.out.println("Animal eat all the time");
    }
}
class Tiger extends Animal{
    void speak(){
        System.out.println("ROOARRRR");
    }

    @Override
    void eat() {
        System.out.println("The Meat!!!");
    }
}
class Elephant extends Animal{
    @Override
    void speak() {
        System.out.println("UUUUUUU");
    }

    @Override
    void eat() {
        System.out.println("Eats watermelon");
    }
}
class Bear extends Animal{
    @Override
    void eat() {
        System.out.println("Bear eat Salmon");
    }

    @Override
    void speak() {
        System.out.println("Arrrr Arrrr");
    }
}