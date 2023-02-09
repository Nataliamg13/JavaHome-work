package class21;

public class Rectangle {
  int length;
  int width;
  int side;
  void CalculateRectangle(int length,int width){
      System.out.println(length*width);}
  void CalculateRectangle(int side) {
      System.out.println(side*side);
      }

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.CalculateRectangle(7);
        r.CalculateRectangle(6,9);
    }
  }

