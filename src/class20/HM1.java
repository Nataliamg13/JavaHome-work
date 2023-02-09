package class20;

public class HM1 {
    //1. Write program: Shape class has a constructor that takes the radius and has a
    // subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    double radius;
    HM1(double radius){
        this.radius=radius;
    }
}
class Circle extends HM1{
    double pi;
    Circle(int radius,double pi){
        super(radius);
        this.pi=pi;
    }
    double CalculateArea(){
        double area=(pi*(radius*radius));
        return area;
    }
}