package class17;

public class correctTask3 {
    String name;
    String lastName;
    int salary;
    int year;

    public correctTask3(int y,String empName,String lastN,int sal) {
        year=y;
        name=empName;
        lastName=lastN;
        salary=sal;

    }
    correctTask3(String empName,String lastN, int y) {
        name=empName;
        lastName=lastN;
        year=y;
    }
    private correctTask3(String lastN, int sal, int y,String empName){
        lastName=lastN;
        salary=sal;
        year=y;
        name=empName;

    }
    protected correctTask3(int sal,String empName,String lastN) {
        salary=sal;
        name=empName;
        lastName=lastN;
    }
    void printInfo(){
        System.out.println("Workers name:"+name+" Last name "+lastName+" salary per" +
                " month "+salary+" start year "+year);
    }
    public static void main(String [] args ) {
       // AllinOne num1=new AllinOne(2019,"John","JO",5000);
       // num1.printInfo();
        AllinOne num2=new AllinOne("Pam","White",9000);
        num2.printInfo();
        AllinOne num3=new AllinOne("Irvin",3000,2022,"Summer");
        num3.printInfo();
        AllinOne num4=new AllinOne(4000,"Shanice","Smart");
        num4.printInfo();


    }
}

