package Java_References.Scanner_Methods;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class next
{
    public static void main(String[] args)
    {

        // next();
        // next_boolean();
        // next_byte();
        // next_double();
        // next_float();
        // next_int();
        // next_line();
        // next_long();
        // Create a scanner object
        // next_short();



    }

    public static void next()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A string to scan");

        // Output the next token
        System.out.println(myObj.next());

        myObj.close();
    }

    public static void next_boolean()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("The value is true");

        // Skip tokens until a boolean is found
        while (myObj.hasNext() && !myObj.hasNextBoolean())
        {
            myObj.next();
        }

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


    }

    public static void next_byte()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A byte is a number between -128 and 127");

        // Print the value of every byte in the scanner
        while (myObj.hasNext())
        {
            if (myObj.hasNextByte())
            {
                System.out.println(myObj.nextByte());
            }
            else
            {
                myObj.next();
            }
        }


    }

    public static void next_double()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("The probability is 45.6 percent");

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

    public static void next_float()
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

    public static void next_int()
    {
        // Create a scanner object
        Scanner myObj = new Scanner("An int is a number between -2,147,483,648 and 2,147,483,647");

        // Print the value of every int in the scanner
        while(myObj.hasNext())
        {
            if(myObj.hasNextInt())
            {
                System.out.println(myObj.nextInt());
            }
            else
            {
                myObj.next();
            }
        }
    }

    public static void next_line()
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

    public static void next_long()
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

    public static void next_short()
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
