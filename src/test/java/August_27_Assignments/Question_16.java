

//  Question 16: Variable Initialization Blocks


package August_27_Assignments;

public class Question_16 {


    static int staticVar ;
    int instanceVar;

    // Static initialization block to initialize staticVar
    static {
        staticVar = 50;  // This block is executed once when the class is loaded
    }

    // Instance initialization block to initialize instanceVar
    {
        instanceVar = 25;  // This block is executed each time an object is created
    }


    public static void main ( String[] args )  {


        System.out.println(staticVar);


        Question_16 Q_16 = new Question_16();

        System.out.println(Q_16.instanceVar);









    }



}
