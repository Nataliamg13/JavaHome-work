package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {
                                    // Limitations of ForEach Loop
        int [] arr={10,13,20,25,45,50};
       // We cant update the elements in ForEach Loop , because we dont have access to the index.

       for(int x:arr){
           if(x%2!=0) {
               x=0;
           }
       }
    }
}
