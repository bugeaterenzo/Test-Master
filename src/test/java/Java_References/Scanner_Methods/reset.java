package Java_References.Scanner_Methods;

import java.util.Scanner;
import java.util.Locale;

public class reset
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A string to scan");

        // Change configuration
        myObj.useDelimiter(",");
        myObj.useLocale(new Locale("es"));
        myObj.useRadix(16);

        // Reset the configuration
        myObj.reset();

        // Read configuration values
        System.out.println(myObj.delimiter());
        System.out.println(myObj.locale());
        System.out.println(myObj.radix());
    }
}
