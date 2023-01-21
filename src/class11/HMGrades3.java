package class11;

public interface HMGrades3 {
    public static void main(String[] args) {

        String [][] names = {{"Kai " , "Dimitri", "Lukas", "Sebastian"},
                                     {"B", "A", "C", "D"} };
          for(int i=0;i<names[0].length; i++) {
              if(names[1][i].equals("A")  && names[1][i].equals("B")) {
                  System.out.println(names[0][i]);
              }
          }

    }
}
