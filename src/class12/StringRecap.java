package class12;

public class StringRecap {
    public static void main(String[] args) {
        // How can i print all the letters from this string one by one
        String str="Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        } //What is the input to the charAt() method its "int" out is a char
        //count how many time the letter "a" has appeared in the above string
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a') {
                count++;
            }
        }
        System.out.println("Letter a apperaed ");
    }
}
