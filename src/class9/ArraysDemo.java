package class9;

public class ArraysDemo {
    public static void main(String[] args) {

        String name="Slava";
        String name2="Safi";
        String name3="Jason";
        String name4="Nabi";
        String name5="Annes";
//                         num0   num1    num2   num3  num4     num5
        String [] names={"Slava" ,"Safi","Jason","Nabi","Anees","Joseph"};

        System.out.println(name2);
        System.out.println(names[1]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all the names from array

        for (int i = 0; i <=5; i++) {
            System.out.println(names[i]);


        }

    }
}
