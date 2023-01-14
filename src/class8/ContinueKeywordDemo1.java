package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i=0; i <10; i++) {
            if(i%3==0) {
                continue;  // technic it should call "skip loop"
                           //Continue=skip the current/specified value and continue with the rest of the code
            }else{        // We skip the part with sout and jump back to the condition i.
                System.out.println(i);  ///this line is never executed when i=3,6,9
            }
            System.out.println("Hello Java");
        }
    }
}
