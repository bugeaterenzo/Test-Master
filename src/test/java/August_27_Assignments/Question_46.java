


//  Question 46: Calculating Circle Circumference



package August_27_Assignments;

import java.util.Scanner;

public class Question_46 {



    public static void main (String[] args) {

        var input = new Scanner(System.in);

        System.out.print("Enter radius of the circle : ");
        double radius = input.nextDouble();

        double Circumference = 2 * Math.PI * radius;

        System.out.println("Circumference " + Circumference);







    }



}
