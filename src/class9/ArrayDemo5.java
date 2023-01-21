package class9;

public class ArrayDemo5 {
    public static void main(String[] args) {

        int [] numbers=new int[5];
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            if (i%2==0)
                sum=sum+numbers[i];
        }
        System.out.println(sum);

        System.out.println("Second part of the QA");

        int[] number={10,20,30,4,5,6,7,80};
        int Sum=0;
        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i]);
            sum += number[i];
        }
        System.out.println(sum*2);
    }

}
