package class8;
                                      /* 12345
    import java                                     12345
                                         12345
                                       */
public class NestedLoops6 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 0; j <=5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("****");

        for (int i = 0; i < 3; i++) {
            System.out.println(" ");

            for (int j = 1; j < 6; j++) {
                System.out.print(j);
            }
            for (int i1=1; i1<+5;i1++) {
                System.out.print(i1+" ");
            }
        }/*for (int i=0; i<3;i++) { // executes the below code 3 time
        for (int j=1; j<+5; j++){
            System.out.println(j+" ");// prints the value of j from1 to 5
        }
        System.out.println(); */

    }

}