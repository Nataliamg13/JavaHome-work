package class17;

public class AllinOneTester {
    public static void main(String[] args) {
        System.out.println("Private");
        AllinOne num1=new AllinOne("Mandy",5000,2019,"JO");
        num1.printInfo();

        System.out.println("Default");
        AllinOne num2=new AllinOne("Pam","White",9000);
        num2.printInfo();

        System.out.println("Public");
        AllinOne num3=new AllinOne("Summer",4000,2022,"Ira");
        num3.printInfo();

        System.out.println("Protected");
        AllinOne num4=new AllinOne(4000,"Shanice","Smart");
        num4.printInfo();
    }
    }

