

//  Question 51: Calculating BMI


package August_27_Assignments;

import java.util.Scanner;

public class Question_51 {

    public static void main (String[] args) {


        var input = new Scanner(System.in);

        System.out.print("Enter weight : ");
        double weight = input.nextDouble();

        System.out.print("Enter height : ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);

        System.out.println(BMI);







    }

}
