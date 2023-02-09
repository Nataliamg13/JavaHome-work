package class17;

public class AllinOne {
    //3) Write a java class that have 4 constructors with 4 different access levels of constructors
    // (private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
    // 2 - from outside the class; 3 - from different class inside different package  and observe
    // result.
    String name;
    String lastName;
    int salary;
    int year;

    private AllinOne(String empName,String lastN,int sal,int y) {
    name=empName;
    lastName=lastN;
    salary=sal;
    year=y;
}
    AllinOne(String empName,String lastN, int y) {
        name=empName;
        lastName=lastN;
        year=y;
}
 public  AllinOne(String lastN,int sal,int y,String empName){
    name=empName;
    lastName=lastN;
    salary=sal;
    year=y;
}
protected AllinOne(int sal,String empName,String lastN) {
    salary=sal;
    name=empName;
    lastName=lastN;
    }
    public void printInfo(){
        System.out.println("Workers name:"+name+" Last name "+lastName+" salary per" +
                " month "+salary+" start year "+year);
    }
    public static void main(String [] args ) {
        AllinOne num1=new AllinOne("Mandy","JO",5000,2019);
        num1.printInfo();
        AllinOne num2=new AllinOne("Pam","White",9000);
        num2.printInfo();
        AllinOne num3=new AllinOne("Summer","Irvin",3000,2022);
        num3.printInfo();
        AllinOne num4=new AllinOne(4000,"Shanice","Smart");
        num4.printInfo();
    }
}