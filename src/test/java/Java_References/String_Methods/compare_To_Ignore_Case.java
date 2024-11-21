package Java_References.String_Methods;

public class compare_To_Ignore_Case
{
    public static void main(String[] args)
    {
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        String myStr3 = "hellos";

        // 'h' (Unicode 104) == 'h' (Unicode 104).
        // 'e' (Unicode 101) == 'e' (Unicode 101).
        // 'l' (Unicode 108) == 'l' (Unicode 108).
        // 'l' (Unicode 108) == 'l' (Unicode 108).
        // 'o' (Unicode 111) == 'o' (Unicode 111).
        System.out.println(myStr1.compareToIgnoreCase(myStr2));

        // Perform a character-by-character comparison:

        //'h' (Unicode 104) == 'h' (Unicode 104).
        //'e' (Unicode 101) == 'e' (Unicode 101).
        //'l' (Unicode 108) == 'l' (Unicode 108).
        //'l' (Unicode 108) == 'l' (Unicode 108).
        //'o' (Unicode 111) == 'o' (Unicode 111).

        //After comparing all characters of "hello", the shorter string ("HELLO") ends.
        // The additional character 's' in "hellos" remains unexamined.

        // The method returns the difference in lengths:
        // result = length of "HELLO" − length of "hellos" =
        // 5 − 6 = −1
        System.out.println(myStr1.compareToIgnoreCase(myStr3));


    }


}
