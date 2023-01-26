package class13;

public class HMTask4 {
    public static void main(String[] args) {
        // How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        String str="This is sentence i want to reverse";
      String [] arr=str.split(" ");

     /* for (String word:arr){
          for (int i = word.length()-1; i >=0; i--) {
              System.out.print(word.charAt(i));
          }                                                      //111111
          System.out.print(" ");

        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);                               //22222222222222222222
            System.out.print(" ");*/

        for(String word:arr) {
            System.out.println(new StringBuilder(word).reverse()+" ");
        }
          }
      }

