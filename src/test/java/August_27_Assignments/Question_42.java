

//  Question 42: Calculating Rectangle Area


package August_27_Assignments;

import java.util.Scanner;

public class Question_42 {




    public static void main (String[] args) {

        var input = new Scanner(System.in);

        System.out.print("Enter length of the rectangle : ");
        int length = input.nextInt();

        System.out.print("Enter length of the width : ");
        int width = input.nextInt();

        double Area = length * width;

        System.out.println("The Area of the rectangle is : " + Area);








    }


}
