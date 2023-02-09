package review6;

public class Garden {

    //New ---is creating a new object
    public static void main(String[] args) {
     Flower flower1=new Flower();
//accessing variables of flower class
        System.out.println(Flower.pretty);
        Flower flower2=new Flower();
        Flower flower3=new Flower();

        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;



        System.out.println("Creating second object of the flower class");


        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;


    }
}
