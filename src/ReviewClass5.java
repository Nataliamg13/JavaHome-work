public class ReviewClass5 {
    public static void main(String[] args) {
        //Creating a clock.
        for (int h1 = 0; h1 <=2 ; h1++) {
            for (int h2 = 0; h2 <=9 ; h2++) {
                if (h1==2 && h2==4){
                    break;
                }
                System.out.println(h1+ ""+h2+":");

                for (int m = 0; m <=59 ; m++) {
                    if (m<10){
                        System.out.println(h1+""+h2+":0"+m);

                    }else{
                        System.out.println(h1+""+h2+":"+m);
        }
    }
}}}}
