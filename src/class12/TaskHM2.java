package class12;

public class TaskHM2 {
    public static void main(String[] args) {
        // Create a String and print it in reverse order (Sunday → yadnuS).

        String str="Sunday";
        System.out.println(str);
        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }}}



