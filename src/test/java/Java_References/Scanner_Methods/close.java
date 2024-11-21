package Java_References.Scanner_Methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class close
{
    public static void main(String[] args)
    {
        String path = "class-commander/src/test/java/Java_References/Scanner_Methods/myName.txt";
        try
        {
            File myName_File = new File(path);
            Scanner myReader = new Scanner(myName_File);

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
            System.out.println("___________________________________");
            e.printStackTrace();
        }



    }


}
