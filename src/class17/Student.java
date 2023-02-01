package class17;

public class Student {
    String name;
    String ID;
    int age;
    double weight;

    Student(String studentName, String studentID, int studentAge, double studentWeight) {
        name = studentName;
        ID = studentID;
        age = studentAge;
        weight = studentWeight;
    }
void printInfo(){
    System.out.println("Name "+name+" ID "+ID+" age "+age+" weight "+weight);
}

}
