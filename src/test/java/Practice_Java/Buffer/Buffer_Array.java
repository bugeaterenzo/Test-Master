package Practice_Java.Buffer;

import java.io.*;
import java.util.Arrays;

public class Buffer_Array {

    public static void main(String[] args) throws IOException {



        String[][] studen_names = {
                {"Bob" , "Jack"},
                {"Mathew" , "Chandler" , "Joey"},
                {"Mike" , "Malcolm X" , "Jesus"}
        };



        BufferedWriter writer = new BufferedWriter(new FileWriter("C://Users//49157//Documents//Java Buffer//Student_Names_Array.txt"));

                write2DArray(studen_names , writer);

                writer.close();

                print2DArray( "C://Users//49157//Documents//Java Buffer//Student_Names_Array.txt" );













    }

    public static void write2DArray(String[][] array , BufferedWriter writer) throws IOException {

        writer.write(( "Student Names : " ) + '\n');

        for (int i = 0; i < array.length; i++)
        {      // Iterate through rows
            for (int j = 0; j < array[i].length; j++)
            {  // Iterate through columns
                writer.write("\n");
                writer.write(( "[ "+ i + " ]" + "[ "+ j + " ]" + " ==> " ) + array[i][j]);   // Print element with a space
            }
            writer.write("\n"); // New line after each row
        }
    }


    public static void print2DArray(String address) throws IOException
    {
        BufferedReader reader_1 = new BufferedReader(new FileReader(address));
        String line = "";

        while ( ( line = reader_1.readLine() ) != null )
        {
            System.out.println(line);
        }
    }

}
