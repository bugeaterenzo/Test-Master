package Java_References.String_Methods;

public class to_String
{
    public static void main(String[] args)
    {


        String myStr = "Hello, World!";

        // Calling toString():

        //The toString() method is explicitly called on myStr.
        //In the String class, the toString() method is overridden to return the string itself.

        System.out.println(myStr.toString());



        Object obj1 = new Integer(42); // Integer object
        Object obj2 = "Hello, World!"; // String object

        System.out.println(obj1.toString()); // Explicit call
        System.out.println(obj2.toString()); // Explicit call for consistency


        // While calling toString() directly on a String literal isn't useful,
        // in some cases, you might be working with objects where null safety matters.

        String myStr1 = null;
        System.out.println(String.valueOf(myStr1)); // Prints "null" instead of throwing an exception



    }



}
