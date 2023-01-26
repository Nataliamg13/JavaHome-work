package class13;

public class HMTask6 {
    public static void main(String[] args) {
        // How would you swap  2 strings without a temporary variable?

        String str1="Smart";
        String str2="student";
        System.out.println(str1+" "+str2);

        str1=str1+str2;
        str2=str1.substring(0,5);
        str1=str1.substring(5);

        System.out.println(str1+" "+str2);
    }
}
