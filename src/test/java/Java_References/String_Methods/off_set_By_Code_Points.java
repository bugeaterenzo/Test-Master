package Java_References.String_Methods;

public class off_set_By_Code_Points
{
    public static void main(String[] args)
    {
        String myStr = "Hello, World!";


        // Starting Index (index): 3
        // This corresponds to the character 'l' at position 3.
        // Code Point Offset (codePointOffset): 2
        // Move forward by 2 code points starting from the character at index 3.

        int result = myStr.offsetByCodePoints(3, 2);
        System.out.println(result);

        // The offsetByCodePoints() method returns an index in a string which is
        // offset from another index by a specified number of code points.





    }



}
