


//  Question 40: Reading and Printing User's Name



package August_27_Assignments;

import java.util.Scanner;

public class Question_40 {



    public static void main (String[] args) {


     var input = new Scanner(System.in);

     System.out.println(" Enter your name : ");
     String firstName = input.next();


     System.out.println(" Enter your lastname : ");
     String lastName = input.next();

     String fullName = firstName + " " +  lastName;

     System.out.println("Hello, " + fullName + " !");




    }

}
