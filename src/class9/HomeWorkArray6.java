package class9;

public class HomeWorkArray6 {
    public static void main(String[] args) {
        // Create an array of countries. While retrieving all values from an array print capital
        // for each country choose any five countries.
         String [] countries={"Australia","Austria","Bahamas","Bahrain","Barbados"};
         String [] capitals={"Canberra","Viena","Nassau","Manama","Bridgetown"};

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i]+ " and their capital is "+capitals[i]);
            
        }
    }
}
