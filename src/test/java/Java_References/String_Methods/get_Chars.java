package Java_References.String_Methods;

public class get_Chars
{
    public static void main(String[] args)
    {
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        String myStr = "Hello, World!";

        // Parameters:
        // srcBegin (7): The starting index in the source string (myStr)
        // from where characters will be copied.
        // srcEnd (12): The ending index in the source string (myStr) up
        // to (but not including) which characters will be copied.
        // So, characters from index 7 to index 11 will be copied.
        // dest (myArray): The destination character array where the characters will be copied.
        // destBegin (4): The index in myArray where the copied characters should start being placed.

        myStr.getChars(7, 12, myArray, 4);
        System.out.println(myArray);
    }
}
