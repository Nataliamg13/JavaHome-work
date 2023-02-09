package class16;

public class HomeWork1 {


        //1) Create a method that will take 2 parameters
        // as a numbers and prints which number is larger.
        int largerNumber ( int num1, int num2){
            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }

        public static void main (String[] args){
           HomeWork1 mp = new HomeWork1();
            System.out.println(mp.largerNumber(10, 30));
        }
    }
