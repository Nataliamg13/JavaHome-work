package class7;

public class ForLoopsHome14 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50
        for (int i = 20; i<=50; i++) {
            if (i%2==1) {
                System.out.println(i);
            }
            System.out.println("++++++++++");

            for (int l=50; l>=20; l--) {
                if(l%2==1){
                    System.out.println(l);
                }
            }
        }
    }
}