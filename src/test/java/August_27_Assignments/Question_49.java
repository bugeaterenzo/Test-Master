

//  Question 49: Calculating Simple Interest


package August_27_Assignments;

import java.util.Scanner;

public class Question_49 {

    public static void main (String[] args) {


        var input = new Scanner(System.in);

        System.out.print("Enter principal : ");
        double principal = input.nextDouble();

        System.out.print("Enter time : ");
        double time = input.nextDouble();

        System.out.print("Enter rate : ");
        double rate = input.nextDouble();

        double SimpleInterest = (principal * rate * time) / 100;

        System.out.println("SimpleInterest = " + SimpleInterest);




    }


}
