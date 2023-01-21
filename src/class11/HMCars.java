package class11;

public class HMCars {
    public static void main(String[] args) {

        // Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array
        // using 2 different loops
        String[][] cars = {{"American", "German", "Korean", "Italian"},
                                   {"GMC", "BMW", "KIA", "LAMBORGHINI"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            ///////////////////////////
            for(String[] car:cars) {
                for(String c:car){
                    System.out.println(c+" ");
                }
            }
        }
    }
}

