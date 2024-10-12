package Practice_Java.Buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_Reader_Example {




    public static void main(String[] args) throws IOException {

        BufferedReader reader_1 = new BufferedReader(new FileReader("C://Users//49157//Documents//Java Buffer//Student_Names.txt"));
        String line = "";

        while ( ( line = reader_1.readLine() ) != null )
        {
            System.out.println(line);
        }



    }










}
