

//  Question 4: Variable Scope in Java


package August_27_Assignments;

public class Question_4 {


    String globalVar = "Global";


    public static void main (String[] args){




    String localVar = "Local";

    System.out.println(localVar);

    printVariables();


    }


    public static void printVariables (){

//        System.out.println(globalVar);


    }


}
