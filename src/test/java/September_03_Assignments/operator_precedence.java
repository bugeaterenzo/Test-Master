package September_03_Assignments;

import java.util.Scanner;

public class operator_precedence {




    public static void main (String[] args) {


//          Question 1: Basic Arithmetic Operations

            int result_1 = 5 + 3 * 2;


//          Question 2: Combining Addition and Parentheses
            int result_2 = (5 + 3) * 2;


//          Question 3: Mixed Operators
            int result_3 = 10 - 4 + 2 * 3;




//          Question 4: Division and Multiplication with Addition
            int result_4 = 8 + 12 / 4 * 2;







//          Question 5: Using Modulus with Addition
            int result_5 = 7 + 9 % 4;





//          Question 6: Order of Operations with Mixed Operators

            int result_6 = 3 + 6 * (5 + 4) / 3 - 7;





//          Question 7: Precedence of Concatenation

            // "Result: " + 5 + 3 * 2;





//          Question 8: Precedence in Boolean Expressions

            boolean result_8 = true || false && false;





//          Question 9: Combining Arithmetic and Relational Operators

            boolean result_9 = 5 + 3 > 2 * 3;






//          Question 10: Complex Expression with Scanner Input


            var in = new Scanner(System.in);

            System.out.print("Give the First number : ");
            int firstNumber = in.nextInt();

            System.out.print("Give the Second number : ");
            int secondNumber = in.nextInt();

            int result_10 = (firstNumber + secondNumber) * firstNumber / secondNumber + 2;

            System.out.println(result_10);






    }
}
