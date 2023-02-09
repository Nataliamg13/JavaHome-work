package class21;

public class Animal {         //Parent class
    String name;
    String color="Black";
}
class Cat extends Animal {    //Child class
    String color="White";
    int age=10;
    double weight;
    void printColor(){
        String color="Blue";
        System.out.println(color);
       // System.out.println(this.color);
       // System.out.println(super.color);
    }
}

