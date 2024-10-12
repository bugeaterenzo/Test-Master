package Practice_Java.Buffer;

import java.io.*;

public class Buffer_Writer_Example {


    public static void main(String[] args) throws IOException {



        String[] names = {"John" , "Max" , "Steven" , "Josh"};

        BufferedWriter writer_1 = new BufferedWriter(new FileWriter("C://Users//49157//Documents//Java Buffer//Student_Names.txt")); // Checked Exception


        writer_1.write("Student Names : ");

        for ( String name : names)
        {
            writer_1.write('\n' + name);
        }

        writer_1.close();

















    }

}
