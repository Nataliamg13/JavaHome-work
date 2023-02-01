package class16;

public class Task3 {

    //Create a method that will print whether given String is palindrome or not.
    //1)For this type we will use " return type=>void
    //2) Name=> is palindrome.
    //3)parameters=>String inputStr

    void polindr(String str) {

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversed=st.toString();
        if(str.equals(reversed)) {
            System.out.println(str + "is palindrome");
        }else{
            System.out.println(str+"Not palindrome");
        }
    }



    public static void main(String[] args) {// void methods can not assign void methods to variable

        Task3 task3=new Task3(); //we create an object of the class
        task3.polindr("Kaya");

    }
}
