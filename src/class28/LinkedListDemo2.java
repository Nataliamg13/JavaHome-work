package class28;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLS");
        subjects.add("Manual Testing");
        subjects.add("JIRA");
        subjects.add("Git");
        subjects.add("Git");
        subjects.add("Jva");

        LinkedList<String> futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("Testing");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");


        LinkedList<String>  allSubjects=new LinkedList<>();
      //Get all the entries from subjects List and futureSubjects and put them in allSubjects lists

        allSubjects.addAll(subjects);
        allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);



        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");
        System.out.println(subjectsILike);
        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);
    }
}
