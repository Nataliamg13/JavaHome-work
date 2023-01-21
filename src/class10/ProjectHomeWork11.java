package class10;

public class ProjectHomeWork11 {
    public static void main(String[] args) {
        //11)Write a program to print out duplicate elements from an Array of Strings?
        String [] names={"Adem","Asli","Natalie","Hiral","Adem","Nelson","Adem"};

        int count=0;
        for (int i=0;i< names.length;i++) {
            if(names[i]=="Adem") {
                count++;
            }
        }
        System.out.println("It will print out Adem "+ count +" times");
    }
}
