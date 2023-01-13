package class7;

public class ForLoopsHome13 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        for (int i = 20; i >= 1; i--) {
            if (i % 2 != 1)
                System.out.println(i);
        }
        System.out.println("********");

        for (int i = 20; i>0; i--) {
            if (i % 2 == 0){
                System.out.println(i);

            }
        }
    }
}