package Java_References.Scanner_Methods;

import java.util.Scanner;

public class redix
{
    public static void main(String[] args)
    {
        redix();

        use_redix();


    }

    public static void redix()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("21");

        // Display the radix (defaults to 10)
        System.out.println(myObj.radix());
        while(myObj.hasNext())
        {
            if (myObj.hasNextInt())
            {
                System.out.println(myObj.nextInt());
            }
        }


        // What Is a Radix?
        //The radix determines the base for numeric interpretation:

        // Base 10 (Decimal): Numbers are interpreted in the usual way (e.g., 123 means one hundred twenty-three).
        // Base 16 (Hexadecimal): Numbers are interpreted using digits 0-9 and letters A-F (e.g., 1F means 31 in decimal).
        // Base 8 (Octal): Numbers use digits 0-7 (e.g., 123 in octal is 83 in decimal).
        // Base 2 (Binary): Numbers use digits 0 and 1.

        // The radix() method returns a number indicating the radix that the scanner
        // uses to interpret whole numbers. The radix specifies how many different
        // symbols can be used to represent each digit in a number. For example, a
        // radix of 16 would allow the symbols 0 to 9 and A to F to be used as digits.
    }

    public static void use_redix()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("FFAD01");

        // Change radix
        myObj.useRadix(16);

        // Read and display the number
        System.out.println(myObj.nextInt());

    }
}
