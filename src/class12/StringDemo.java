package class12;

public class StringDemo {
    public static void main(String[] args) {
        //Creating an object of the String Class
        String strObj=new String("Java");
        // Another way of creating an object of String class a shorter way
        //Mostly this is how we create the objects of Strings class
        String strObj2="Java";
        System.out.println(strObj2.length());
        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name="Hamid poya ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }
    }
}
