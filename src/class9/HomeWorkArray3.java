package class9;

public class HomeWorkArray3 {
    public static void main(String[] args) {
       // Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using
        // elements of array: “Saturday is Java coding Day”.

    String [] words={"Java","Saturday","day","coding","is"};

    words[0]="Saturday";
    words[1]="is";
    words[2]="Java";
    words[3]="coding";
    words[4]="day";

    for(int i=0; i< words.length; i++){
        System.out.print(words[i]+ " ");
    }
    }
}
