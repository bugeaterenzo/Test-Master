package Java_References.String_Methods;

public class code_Point_Count
{
    public static void main(String[] args)
    {
        String myStr = "Hello";

        // Use the startIndex and endIndex parameters
        // to specify where to begin and end the search.
        int result = myStr.codePointCount(0, 5);

        // Return the number of Unicode values found in a string:
        System.out.println(result);
    }
}
