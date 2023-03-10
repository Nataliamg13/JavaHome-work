package Project2;

public class Car {
    //3. Create a Class Car that would have the following fields: carPrice and color and method
    //calculateSalePrice() which should be returning a price of the car.Create 2 sub classes: Sedan and Truck.
    // The Truck class has a field as weight and has its own implementation of calculateSalePrice() method
    //in which returned price is calculated as following: if weight>2000 then returned price
    //car should include 10% discount, otherwise 20% discount.The Sedan class has field as length and also
    //does it is own implementation of calculateSalePrice(): if length of sedan is >20
    //feet then returned car price should include 5%discount, otherwise 10% discount

    Car() {
    }
        double carPrice;
        String color;

        public Car(String color ,double carPrice) {
            this.color=color;
            this.carPrice=carPrice;
        }
        public double calculateSalePrice(){
            return carPrice;
        }
    }
class Sedan extends Car {
    public Sedan(int length,String color,double carPrice){
        super(color,carPrice);
        this.length=length;
    }
    private int length;

    public double calculateSalePrice(){
        if(length>20) {
            carPrice-=carPrice*0.05;
        }else{
            carPrice-=carPrice*0.01;
        }
        return carPrice;
    }
}
class Truck extends Car{
    int weight;

    Truck(){
        super();
    }
    public Truck(int weight,String color,double carPrice ){
        super(color,carPrice);
        this.weight=weight;
    }
     //int weight;
    public double calculateSalePrice(){
        if(weight>2000){
            carPrice-=carPrice*0.1;
        }else{
            carPrice-=carPrice*0.2;
        }
        return carPrice;
    }
}