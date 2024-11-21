package Java_References.Scanner_Methods;

import java.util.Scanner;

public class delimiter
{
    public static void main(String[] args)
    {

        // The delimiter() method returns a Pattern object describing the
        // sequence of characters which separates tokens in the data being
        // scanned. The default delimiter is a sequence of whitespace characters,
        // but it can be changed with the useDelimiter() method.

        //Learn more about the Pattern object in our Java RegEx tutorial.

        // Create a scanner object
        Scanner myObj = new Scanner("A string to scan");

        // Find the delimiter
        System.out.println(myObj.delimiter());

        // Close the scanner
        myObj.close();

        // Create a scanner object
        Scanner input = new Scanner("Item 1,Item 2,Item 3");

        // Change delimiter
        input.useDelimiter(",");

        // Read the contents of the scanner
        while (input.hasNext())
        {
            System.out.println(input.next());
        }

        // Close the scanner
        input.close();

    }



}
