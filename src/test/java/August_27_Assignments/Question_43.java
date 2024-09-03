

//  Question 43: Converting Celsius to Fahrenheit


package August_27_Assignments;

import java.util.Scanner;

public class Question_43 {




    public static void main (String[] args) {


        var input = new Scanner(System.in);

        System.out.print("Enter temperature in celsius : ");
        int celsius = input.nextInt();

        double Fahrenheit = (celsius * 9/5) + 32;

        System.out.println(Fahrenheit + " °F");









    }




}
