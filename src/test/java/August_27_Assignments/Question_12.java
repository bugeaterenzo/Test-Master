


//  Question 12: Understanding Static Variables


package August_27_Assignments;

public class Question_12 {


    static int counter;



    public static void main (String[] args ){


        System.out.println(++counter);

        Question_12 Q_12 = new Question_12();

        System.out.println(++Q_12.counter);



//      static variables can still be accessed with an object instance of the class, and it is fine
//      to create instances of a class in order access a static variable





    }







}
