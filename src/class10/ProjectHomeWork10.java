package class10;

public class ProjectHomeWork10 {
    public static void main(String[] args) {
        //Write a java program to find the second largest number in the array?
        int num[] = {23,14,56,77,66,67};
        int first = 0;
        int sec = 0;
        for(int i = 0 ; i <num.length; i++){
            if(first < num[i]){
                sec = first;
                first = num[i];
            }
            else if(sec < num[i]){
                sec = num[i];
            }

        }
        System.out.println("First highest number is " + first);
        System.out.println("Second highest number is " + sec);

}
    }


