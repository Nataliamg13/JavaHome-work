package Project2;

public class CarTester {
    public static void main(String[] args) {
        Truck t=new Truck(500,"black",6000);
        System.out.println(t.calculateSalePrice());
        Sedan s=new Sedan(100,"Gold",3000);
        System.out.println(s.calculateSalePrice());
    }
}
