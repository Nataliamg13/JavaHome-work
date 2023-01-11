package class6;

public class WhileLoops4 {
    public static void main(String[] args) {

        int number=1; // number:1
        int sum=0;     //sum:0
        while (number<=5)
        {
            sum=sum+number;  //number:1 sum:0
            number++;   ////they are adding ,so value is
        }
        System.out.println(sum); // This print out is outside of the loop.   SUM is :15

    }
}
