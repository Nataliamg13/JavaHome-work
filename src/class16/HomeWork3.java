package class16;

public class HomeWork3 {
    // 4)Create a method that will say Hello in different language based on the country
    // that will pass when method is executed

    String hello(String country) {
        switch (country.toLowerCase()) {
            case "russia":
                return "Привет";
            case "moldova":
                return "Buna";
            case "india":
                return "हेलो";
            case "italian":
                return "Ciao";
            default:
                return "Wrong input";
        }
    }

    public static void main(String[] args) {
        HomeWork3 input = new HomeWork3();
        System.out.println(input.hello("moldova"));
    }
}