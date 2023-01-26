package class13;

public class HMTask5 {
    public static void main(String[] args) {
  // How would you check if String is palindrome or not? aba=> true
        //Abbc =>false

        String str="aba";
        String reverse="";
        for(int i=str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);
            System.out.println(reverse);
        }

        if (str.toUpperCase().equals(reverse.toUpperCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
