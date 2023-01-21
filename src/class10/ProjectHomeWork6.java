package class10;

public class ProjectHomeWork6 {
    public static void main(String[] args) {
        //6)Write a program to swap 2 numbers without a temporary variable?

        int x=10;
        int y=15;
        System.out.println(x);
        System.out.println(y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }
}
