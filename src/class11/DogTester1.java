package class11;
import java.util.Scanner;
public class DogTester1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();


        dog1.breed = "Husky";
        dog1.size = "Fluffy";
        dog1.color = "Light Gray with white";
        dog1.age = 2;
        dog1.weight = 65;


        dog2.breed = "Bulldog";
        dog2.size = "heavy medium";
        dog2.color = "Rusty and White";
        dog2.age = 4;
        dog2.weight = 45;


        dog3.breed = "Labrador";
        dog3.size = "Large";
        dog3.color = "Black";
        dog3.age = 7;
        dog3.weight = 70;

        System.out.println("Dog Object 1: Breed: " + dog1.breed + " Size: " + dog1.size + " Color: " + dog1.color + " Age: " + dog1.age);
        System.out.println("Dog Object 1: Breed: " + dog2.breed + " Size: " + dog2.size + " Color: " + dog2.color + " Age: " + dog2.age);
        System.out.println("Dog Object 1: Breed: " + dog3.breed + " Size: " + dog3.size + " Color: " + dog3.color + " Age: " + dog3.age);

    }
}