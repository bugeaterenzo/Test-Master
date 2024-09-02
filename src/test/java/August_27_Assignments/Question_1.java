

// Question 1: Understanding Variables in Java


package August_27_Assignments;

public class Question_1 {

    static int classLevelVar = 10;

    String instanceVar = "Hello";


    public static void main (String[] args){


    double localVar = 20.5;
    localVar = 30.5;
    System.out.println(localVar);


    System.out.println(classLevelVar);


    Question_1 v_demo  = new Question_1();

    System.out.println(v_demo.instanceVar);





    }



}
