package Java_References.String_Methods;

public class content_Equals
{
    public static void main(String[] args)
    {

        String myStr = "Hello";


        // contentEquals() Method
        // The contentEquals() method checks if the content of the string is equal
        // to another CharSequence (which includes String, StringBuilder, StringBuffer, etc.).

        // Key Points:
        // Compares the contents of the string with another CharSequence (not necessarily a String).
        // This method is generally used when you want to compare a String to a
        // StringBuilder, StringBuffer, or any other object that implements CharSequence.
        // Like equals(), it performs a character-by-character comparison,
        // but it works with any CharSequence, not just other String objects.

        System.out.println(myStr.contentEquals("Hello"));  // true
        System.out.println(myStr.contentEquals("e"));      // false
        System.out.println(myStr.contentEquals("Hi"));     // false
        System.out.println(myStr.contentEquals("hello"));  // false

        // However :

        // 1. equals() Method
        // The equals() method compares two String objects for equality
        // based on their content (i.e., character-by-character comparison).



        String str1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");
        String str2 = "hello";

        // Comparing String with StringBuilder
        System.out.println(str1.contentEquals(sb)); // true, because the contents are the same

        // Comparing String with another String
        System.out.println(str1.contentEquals(str2)); // false, because "H" != "h"


    }
}
