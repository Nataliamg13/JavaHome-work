package class7;

public class ForLoops4 {
    public static void main(String[] args) {

        //1 2 4 5 7 8 10 11 13 14 16 17 19
      for (int i=0; i<20; i++){
         if(i%3!=0) { //In this line numbers are divided by 3
             // and check if the remainder is zero
             System.out.println(i);
         }
      }
    }
}
