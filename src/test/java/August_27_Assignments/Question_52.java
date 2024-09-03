

//  Question 52: Adding Three Numbers


package August_27_Assignments;

import java.util.Scanner;

public class Question_52 {

    public static void main (String[] args) {

        var input = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        double num1 = input.nextDouble();

        System.out.print("Enter number 2 : ");
        double num2 = input.nextDouble();

        System.out.print("Enter number 3 : ");
        double num3 = input.nextDouble();

        double sum = num1 + num2 + num3;

        System.out.println(sum);



    }

}
