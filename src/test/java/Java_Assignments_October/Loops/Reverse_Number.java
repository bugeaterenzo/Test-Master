package Java_Assignments_October.Loops;

import java.util.Scanner;

public class Reverse_Number {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while ( number != 0 ) {
            // Get the last digit of the number
            int digit = number % 10 ;
            System.out.println(number + " % 10 = " + digit + " ");
            // Append the digit to the reversed number
            reversedNumber = reversedNumber * 10 + digit;
            System.out.println( "reversedNumber = " + reversedNumber + " ");
            // Remove the last digit from the number
            number /= 10;
            System.out.println("Current Vale of Number / 10  = " + number + " ");
        }

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();


        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = inputScanner.nextInt();

        // Convert the number to a string
        String numberAsString = String.valueOf(originalNumber);
        String reversedString = "";

        // Reverse the string representation of the number
        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            reversedString += numberAsString.charAt(i);
        }

        // Print the reversed string (preserving any leading zeros)
        System.out.println("Reversed number: " + reversedString);

        inputScanner.close();














    }
}
