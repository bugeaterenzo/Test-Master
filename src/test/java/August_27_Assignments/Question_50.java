

//  Question 50: Converting Kilometers to Miles


package August_27_Assignments;

import java.util.Scanner;

public class Question_50 {


    public static void main (String[] args) {


        var input = new Scanner(System.in);

        System.out.print("Enter distance : ");
        double kilometers = input.nextDouble();

        double Miles = kilometers * 0.621371;

        System.out.println(kilometers + " kilometers is " + Miles + " miles.");



    }

}
