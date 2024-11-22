package Java_References.Scanner_Methods;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class has_next
{
    public static void main(String[] args)
    {



        //has_Next();

        has_Next_Boolean();

        //has_Next_Byte();

        //has_Next_Double();

        //has_Next_Float();

        has_Next_Int();

        //has_Next_Line();

        //has_Next_Long();

        //has_Next_Short();




    }

    public static void has_Next()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A string to scan");

        // Read every token
         while(myObj.hasNext())
        {
            System.out.println(myObj.next());
        }

         myObj.close();
    }

    public static void has_Next_Boolean()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("The value is true");

        // Skip tokens until a boolean is found
        while (myObj.hasNext() && !myObj.hasNextBoolean())
        {
            myObj.next();

            // What Happens Without myObj.next():

            // If you remove or comment out myObj.next();, the Scanner will never
            // move to the next token.
            // When the while loop condition is checked again, myObj.hasNextBoolean()
            // will still evaluate false for the same token, because the scanner
            // remains stuck on the same token.
            // The loop will keep running indefinitely because the condition will
            // never change, creating an infinite loop.

        }

        // Iterative Breakdown
        //For the input string "The value is true", here’s how the loop executes:

        //Input Tokens: "The", "value", "is", "true"

        //Iteration 1:
        //
        //Condition: myObj.hasNext() → true (token "The" exists).
        //Check: myObj.hasNextBoolean() → false ("The" is not a boolean).
        //Action: myObj.next() → Advances to the next token. "The" is skipped.

        //Iteration 2:
        //
        //Condition: myObj.hasNext() → true (token "value" exists).
        //Check: myObj.hasNextBoolean() → false ("value" is not a boolean).
        //Action: myObj.next() → Advances to the next token. "value" is skipped.

        //Iteration 3:
        //
        //Condition: myObj.hasNext() → true (token "is" exists).
        //Check: myObj.hasNextBoolean() → false ("is" is not a boolean).
        //Action: myObj.next() → Advances to the next token. "is" is skipped.

        //Iteration 4:
        //
        //Condition: myObj.hasNext() → true (token "true" exists).
        //Check: myObj.hasNextBoolean() → true ("true" is a boolean).
        //Loop Exits.

        // Check: if (myObj.hasNextBoolean())
        //true because the token "true" is a boolean.

        // If there is a boolean then print it
        if (myObj.hasNextBoolean())
        {
            System.out.print("The boolean value is ");
            System.out.println(myObj.nextBoolean());
        }
        else
        {
            System.out.println("No boolean found");
        }


        myObj.close();
    }


    public static void has_Next_Byte()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A byte is a number between -128 and 127");

        // Print the value of every byte in the scanner
        while(myObj.hasNext())
        {
            if(myObj.hasNextByte())
            {
                System.out.println(myObj.nextByte());
            }
            else
            {
                myObj.next();
            }
        }

        myObj.close();
    }


    public static void has_Next_Double()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("The,probability,is,45.6,percent");

        myObj.useDelimiter(",");
        // Print the value of every floating point number in the scanner
        while (myObj.hasNext())
        {
            if (myObj.hasNextDouble())
            {
                System.out.println(myObj.nextDouble());
            }
            else
            {
                myObj.next();
            }
        }
    }


    public static void has_Next_Float()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("The probability is 45.6 percent");

        // Print the value of every floating point number in the scanner
        while (myObj.hasNext())
        {
            if (myObj.hasNextFloat())
            {
                System.out.println(myObj.nextFloat());
            }
            else
            {
                myObj.next();
            }
        }
    }

    public static void has_Next_Int()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("An int is a number between -2,147,483,648 and 2,147,483,647");

        // Print the value of every int in the scanner
        while (myObj.hasNext())
        {
            if (myObj.hasNextInt())
            {
                System.out.println(myObj.nextInt());
            }
            else
            {
                myObj.next();
            }
        }
    }

    public static void has_Next_Line()
    {
        String path = "class-commander/src/test/java/Java_References/Scanner_Methods/myName.txt";


        try
        {
            File myName = new File(path);
            Scanner myReader = new Scanner(myName);

            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void has_Next_Long()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A long is a number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807");

        // Print the value of every long in the scanner
        while (myObj.hasNext())
        {
            if (myObj.hasNextLong())
            {
                System.out.println(myObj.nextLong());
            }
            else
            {
                myObj.next();
            }
        }
    }

    public static void has_Next_Short()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("An short is a number between -32,768 and 32,767");

        // Print the value of every short in the scanner
        while (myObj.hasNext())
        {
            if (myObj.hasNextShort())
            {
                System.out.println(myObj.nextShort());
            }
            else
            {
                myObj.next();
            }
        }
    }
}
