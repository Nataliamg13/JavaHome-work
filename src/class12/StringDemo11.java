package class12;

public class StringDemo11 {
    public static void main(String[] args) {

        String str="Send it to the support channel.More java";
        //return the new String from this index
        String newStr=str.substring(5);
        System.out.println(newStr);
        String newStr1=str.substring(28);
        System.out.println(newStr1);
        //we can also specify the starting point and the ending point
        System.out.println(str.substring(0,27));
    }
}
