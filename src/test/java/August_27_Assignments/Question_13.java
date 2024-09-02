

//  Question 13: Understanding Instance Variables


package August_27_Assignments;

public class Question_13 {



    int instanceCounter = 0;


    public static void main (String[] args) {


    Question_13 Q_13_1 = new Question_13();
    System.out.println( ++Q_13_1.instanceCounter);
    System.out.println( ++Q_13_1.instanceCounter);

    Question_13 Q_13_2 = new Question_13();
    System.out.println( ++Q_13_2.instanceCounter);

    System.out.println(Q_13_1.instanceCounter);
    System.out.println(Q_13_2.instanceCounter);


//  1. Instance Variables:

//      int instanceCounter = 0; is an instance variable.
//      Instance variables are unique to each object created from a class.
//      This means that each object of the Question_13 class has its own copy of the instanceCounter variable.
//      The value of an instance variable is not shared between different objects of the same class.
//      Each object maintains its own state.


//  2. Object Creation and Variable Behavior:

//      When you create a new object, such as Question_13 Q_13_1 = new Question_13();,
//      a new instance of Question_13 is created.
//      This new instance has its own instanceCounter,
//      initialized to 0 because instance variables are initialized when an object is created.










    }







}
