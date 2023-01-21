package class11;

public class HMEven {
    public static void main(String[] args) {

        int [][] even={{10,13,7,9},
                       {8,36,27,6},
                     {24,63,77,90}};

        for (int i = 0; i < even.length; i++) {
            for (int j = 0; j < even[i].length; j++) {
                if(even[i][j]%2==0){
                    System.out.println(even[i][j]);
                }

            }

        }
    }
}
