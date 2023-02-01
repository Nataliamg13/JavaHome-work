package class17;

public class StudentHM2 {
    //2)Write a java Class Students that have a constructor which takes students
    // name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    // Test Student class for 5 different students with different marks. Your program should print
    // an average mark of each students name.
    //NOTE: please use different names for instance and local variables.
   String name;
   int java;
   int manualTesting;
  int SDLS;
    StudentHM2(String name2, int java2, int manualTesting2, int SDLS2) {
        name=name2;
        java=java2;
        manualTesting=manualTesting2;
        SDLS=SDLS2;

    }
    void print(){
        int average=(java+manualTesting+SDLS)/3;
        System.out.println(name+" an avarage score is "+average);
    }
}
