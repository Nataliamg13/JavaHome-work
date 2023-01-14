package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;
        while (summer) {
            if (temp <= 100) { // so its working like "75+5=80, next 85,90,95,100
                System.out.println("I love summer");
            } else {
                System.out.println("Its very hoy");
                break;
            }
            temp += 5;
        }
        System.out.println("*******");
            boolean summer2=true;
        for (int i = 75; i<=100; i+=5) {
                System.out.println("I love summer because Temperature is "+i);
            }
            System.out.println("Its very hot" );
        }
    }

