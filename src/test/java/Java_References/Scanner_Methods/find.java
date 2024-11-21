package Java_References.Scanner_Methods;

import java.util.Scanner;

public class find
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner myObj = new Scanner("Please send an email to info@example.com for more details.");

        // Get the email address with a pattern
        String email = myObj.findInLine("[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]{2,}");

        // [a-zA-Z]+: Matches one or more letters (both uppercase and lowercase).
        // @: Matches the literal @ symbol.
        // [a-zA-Z]+: Matches one or more letters (representing the domain name).
        // .: Matches the literal . (dot). The backslash is escaped (.) because . has special meaning in regex (it matches any character).
        // [a-zA-Z]{2,}: Matches two or more letters (representing the top-level domain, e.g., com, org).
        // The entire regex pattern identifies strings in the format of an email address (e.g., info@example.com).

        // Show the email if found
        if (email != null)
        {
            System.out.println(email);
        } else
        {
            System.out.println("No email found");
        }

        myObj.close();


        Scanner input = new Scanner("Please send an email to info@example.com for more details.");

        // Get the email address with a pattern
        String gmail = input.findWithinHorizon("[a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]{2,}", 35);

        // Show the email if found
        if (gmail != null) {
            System.out.println(gmail);
        } else {
            System.out.println("No email found");
        }


        input.close();



    }


}
