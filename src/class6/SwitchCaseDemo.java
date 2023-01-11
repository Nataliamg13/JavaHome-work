package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";

        System.out.println(country.toLowerCase()); // It will switch USA-usa ,lower case letters.

        switch (country.toLowerCase()) {

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                    System.out.println("Kebab");
                    break;
            default:
            System.out.println("Wrong country");

        }
    }
}
