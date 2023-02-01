package class17;

public class AddressHM5 {
    //5) Write a Student class   that have instance variables name and address. Create a constructor that will
    // initialize those variables. Print name & address of given  student using displayInfo method.
    String Name;
    String Address;

    AddressHM5(String name, String address){
        Name=name;
        Address=address;
    }

    void displayInfo(){
        System.out.println("Student name "+Name+" address "+Address);
    }
}
