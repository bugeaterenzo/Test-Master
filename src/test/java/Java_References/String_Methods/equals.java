package Java_References.String_Methods;

public class equals
{
    public static void main(String[] args)
    {


        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        StringBuilder sb = new StringBuilder("Hello");

        // 1. equals() Method
        // The equals() method compares two String objects for equality
        // based on their content (i.e., character-by-character comparison).

        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false

        // as you can see equals() method can not
        // check equality between a String and a StringBuilder
        System.out.println(myStr1.equals(sb)); // false

        // The equals() method in Java is defined in the Object class,
        // and it is overridden in most classes, including String.
        // The String class specifically overrides the equals() method
        // to compare the contents of two strings. However, it only returns
        // true when both objects being compared are of the same type.


        // However :
        // contentEquals() Method
        // The contentEquals() method checks if the content of the string is equal
        // to another CharSequence (which includes String, StringBuilder, StringBuffer, etc.).

        // Key Points:
        // Compares the contents of the string with another CharSequence (not necessarily a String).
        // This method is generally used when you want to compare a String to a
        // StringBuilder, StringBuffer, or any other object that implements CharSequence.
        // Like equals(), it performs a character-by-character comparison,
        // but it works with any CharSequence, not just other String objects.


    }
}
