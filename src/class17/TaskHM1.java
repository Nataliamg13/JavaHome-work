package class17;

public class TaskHM1 {

    String name;
    String id;
    int age;
    double weight;
   TaskHM1 (String name, String id, int age, double weight) {
    name=name;
    id=id;
    age=age;
    weight=weight;
    }
    TaskHM1(){
   }
   void print() {
       System.out.print(name+" "+id+" "+age+" "+weight);
   }
}
