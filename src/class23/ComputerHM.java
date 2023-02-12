package class23;

public class ComputerHM {
    //Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    //Define common behavior within and some fields in parent class and override some
    // of the methods in child classes
    //Define some methods specific to child classes
    //Create objects of child classes and store them into array. Loop through each
    // object and execute available methods.


    public void memory() {
        System.out.println("This computer have a great memory");
    }

    void workFast() {
        System.out.println("Execute the problem fast");
    }

    void display() {
        System.out.println("It last all day without charging");
    }
}

    class Apple extends ComputerHM {
        public void memory() {
            System.out.println("Apple computer have great memory");
        }

        void workFast (){
            System.out.println("Apple does the work fast");
        }
       void display (){
        System.out.println("Apple last all day");
    }
    }
    class Lenovo extends ComputerHM{
        public void memory() {
            System.out.println("Lenovo computer have Awesome memory");
        }

        void workFast (){
            System.out.println("Lenovo does the work very fast");
        }
        void display  (){
            System.out.println("Lenovo last ALL day LONG");
        }
        }

        class HP extends ComputerHM{
            public void memory() {
                System.out.println("HP computer have good memory");
            }

            void workFast (){
                System.out.println("HP does the work ");
            }
            void display (){
                System.out.println("HP last all half day");
            }
        }

        class Dell extends ComputerHM{
            public void memory() {
                System.out.println("Dell computer have ok memory");
            }

            void workFast (){
                System.out.println("Dell does the work fast but die faster");
            }
            void display (){
                System.out.println("Dell last  two hours a day");
            }
        }