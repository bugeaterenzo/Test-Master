package Java_References.String_Methods;

public class copy_Value_Of
{
    public static void main(String[] args)
    {
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";

        // parameter Description
        // data	    A char array
        // offset	An int value, representing the start index of the char array
        // count	An int value, representing the length of the char array

        // data:    The source char[] array.
        // offset:  The starting index in the array from which characters are copied.
        // count:   The number of characters to copy starting from the offset.

        myStr2 = myStr2.copyValueOf(myStr1, 0, 2);
        System.out.println("Returned String: " + myStr2);


    }
}
