package class9;

public class HomeWorkArray1 {
    public static void main(String[] args) {

        //Create an array of chars and store grades into it: A,B,C,D,E,F.
        // Then print a grade B (use 2 different ways of creating an array).
        char [] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < letters.length; i++) {

            System.out.println(letters[1]);
        }
        System.out.println("0000000000");

        char [] grade=new char[6];
        grade[0]='A';
        grade[1]='B';
        grade[2]='C';
        grade[3]='D';
        grade[4]='E';
        grade[5]='F';

        System.out.println(grade[1]);




    }
}