package Project2;

public abstract class Marks {
    //2. We have to calculate the average of marks
    //obtained in three subjects by student A and by
    //student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning
    //the average percentage of marks. Provide
    //implementation of abstract method in classes
    //'A' and 'B'. The constructor of student A takes the
    //marks in three subjects as its parameters and
    //the marks in four subjects as its parameters for
    //student B. Test your code
    abstract void getPercentage();
}
 class A extends Marks{
    int math, pe, stem;

    A(int math,int pe, int stem){
        this.math=math;
        this.pe=pe;
        this.stem=stem;
    }
     @Override
     public void getPercentage() {
         System.out.println((this.math+this.pe+this.stem)/3);
     }
}
  class B extends Marks{
    int math,pe,stem,ls;
    B(int math,int pe,int stem,int ls){
        this.math=math;
        this.pe=pe;
        this.stem=stem;
        this.ls=ls;
    }
      @Override
     public void getPercentage() {
          System.out.println((this.math+this.stem+this.pe+this.ls)/4);
      }
  }
