package class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class HMTask4 {
    public static void main(String[] args) {

        Set<String> s=new LinkedHashSet<>();
        s.add("We ");
        s.add("deserve");
        s.add("a");
        s.add("vacation");

        for (String s1 : s) {
            System.out.print(s1+" ");
        }
    }
}


