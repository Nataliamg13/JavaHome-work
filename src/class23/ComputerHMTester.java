package class23;

import java.util.concurrent.Callable;

public class ComputerHMTester {
    public static void main(String[] args) {

        ComputerHM [] computers={new Apple(),new Lenovo(),new HP(),new Dell()};

        for (ComputerHM computerHM:computers){
            computerHM.memory();
            computerHM.workFast();
            computerHM.display();


        }


    }
}
