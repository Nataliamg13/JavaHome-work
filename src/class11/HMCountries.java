package class11;

public class HMCountries {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries, south america countries, europe countries,
        // asian countries, african countries. Then print all values from that array using 2 different loops and
        // calculate how many total countries been stored
     String [][] countries={{"Canada","USA","Mexico",},
             {"Brazil","Chile","Argentina","Bolivia"},
             {"Italy","Germany","Hungary","Denmark"},
             {"Maldives","Cyprus","Qatar","Saudi Arabia"},
             {"Kenia","Tanzania","Morocco","Egypt"}};
     int sum=0;
     for(int i=0;i< countries.length;i++) {
         for (int j = 0; j < countries[i].length; j++) {
             sum++;
         }}
             System.out.println("The total sum of the countries is "+sum);
        System.out.println("*****************");

        for(String []all:countries) {
            for(String c:all){

                System.out.println("All the countries "+sum);
            }
        }


         }
     }


