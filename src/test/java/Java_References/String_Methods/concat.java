package Java_References.String_Methods;

public class concat
{
    public static void main(String[] args)
    {
        String firstName = " John ";
        String lastName  = " Doe";
        int digits = 23;

        // firstName.concat(lastName)
        // Mechanism:

        // This is a method from the String class.
        // It concatenates the lastName string to the end of firstName.
        // It does not modify the original strings because String in Java is immutable.
        // Instead, it creates a new String object with the concatenated result.
        // Both operands must be String. If lastName is null, it will throw a NullPointerException.
        System.out.println(firstName.concat(lastName));

        // As you can see concat() requires string as a value...!
        // System.out.println(firstName.concat(digits));

        // firstName + lastName
        // Mechanism:

        // This uses the string concatenation operator (+).
        // Behind the scenes, the + operator is translated by the compiler
        // into a call to the StringBuilder class (or StringBuffer in older versions of Java).
        // It first converts the objects into strings (if not already strings), appends them,
        // and creates a new String.

        // new StringBuilder(firstName).append(lastName).toString();
        // This is more flexible than concat() because
        // it can handle null and non-String types gracefully.
        System.out.println(firstName + lastName);



        StringBuilder sb = new StringBuilder("Initial value: ");

        // Append a null value
        String nullString = null;
        sb.append(nullString); // Appends the string "null"
        System.out.println("After appending null: " + sb);

        // Append an empty string
        String emptyString = "";
        sb.append(emptyString); // Does not change the content
        System.out.println("After appending empty string: " + sb);

        // Append a non-string value (e.g., integer)
        int number = 42;
        sb.append(number); // Converts the number to a string and appends
        System.out.println("After appending an integer: " + sb);

        // Append a floating-point number
        double pi = 3.14159;
        sb.append(pi); // Converts the double to a string and appends
        System.out.println("After appending a double: " + sb);

        // Append a character
        char exclamation = '!';
        sb.append(exclamation); // Appends the character
        System.out.println("After appending a character: " + sb);

        // Append a boolean value
        boolean isAwesome = true;

        // String.valueOf(isAwesome), which:
        // Converts the boolean true to the string "true".
        // Converts the boolean false to the string "false".
        // Converts the boolean to a string and appends
        sb.append(isAwesome);

        System.out.println("After appending a boolean: " + sb);

        // Append an object
        Object obj = new Object();
        sb.append(obj); // Calls obj.toString() and appends the result
        System.out.println("After appending an object: " + sb);

    }
}
