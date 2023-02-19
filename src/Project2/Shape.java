package Project2;
    //1. Create an Interface 'Shape' with undefined
    //methods as calculateArea and
    //calculatePerimeter. Create 2 classes Circle &
    //Square that implements functionality defined in
    //the Shape Interface. Test your code.

    public interface Shape {

        void calculateArea(double r);
        void calculatePerimeter(double pi);
    }
    class circle implements Shape {
        @Override
        public void calculateArea(double r) {
            System.out.println("Area of circle "+Math.PI*(r*r));
        }

        @Override
        public void calculatePerimeter(double pi) {
            System.out.println("Perimeter of circle "+2*(Math.PI*pi));
        }

    }
    class Square implements Shape {

        @Override
        public void calculateArea(double r) {
            System.out.println("Area of square "+r*r);
        }

        @Override
        public void calculatePerimeter(double pi) {
            System.out.println("Perimeter of square "+(pi*4));

        }
    }
    

