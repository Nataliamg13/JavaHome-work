package class6;

public class WhileLoops6 {
    public static void main(String[] args) {

/*
        boolean condition=true;
        while(condition) {
            System.out.println("Hello World");
            condition=false;
        }


        System.out.println(@@@@@@@@@);

*/
        boolean condition = true;
        int number = 0;
        while (condition) {
            System.out.println("Hello World");
            if (number > 3) {
                condition = false;
            }
            number++;
        }


    }
}