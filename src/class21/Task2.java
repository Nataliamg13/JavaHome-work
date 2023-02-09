package class21;

public class Task2 {
    static void method(String str1) {
        System.out.println("Method with 1 String");
    }
    static void method(String str1, String str2) {
        System.out.println("Method with 2 Strings");
    }
  static void method(String str1,String str2, String str3) {
    System.out.println("Method with 3 Strings");
}
public static void main (String [] args) {
        method("java");
        method("Python","java");
    }
}