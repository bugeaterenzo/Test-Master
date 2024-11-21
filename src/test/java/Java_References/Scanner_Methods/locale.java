package Java_References.Scanner_Methods;
import java.util.Locale;
import java.util.Scanner;


public class locale
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner myObj = new Scanner("A string to scan");

        // When you create a Scanner object, it uses the default locale
        // of your Java Virtual Machine (JVM) unless specified otherwise.
        // The locale affects how the Scanner parses numbers, dates, and
        // other locale-sensitive tokens.

        // Find the locale
        System.out.println(myObj.locale());

        // en_DE
        // Language: en (English)
        // Country/Region: DE (Germany)

        // en_US
        // This indicates:
        // Language: en (English)
        // Country/Region: US (United States)\

        use_locater();



    }

    public static void use_locater()
    {
        String number = "1.500.000";
        // Create a scanner object
        Scanner myObj = new Scanner(number);

        // The useLocale() method requires a Locale object as an argument.
        // Locale objects represent a language or country and they are used
        // by a variety of Java classes to handle formatting and interpreting data.

        // Change delimiter
        myObj.useLocale( new Locale("es") );

        System.out.println(number);

        // Read and display the number
        System.out.println(myObj.nextInt());

        System.out.println(myObj.locale());

    }
}
