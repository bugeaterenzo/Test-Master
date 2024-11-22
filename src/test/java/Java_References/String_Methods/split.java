package Java_References.String_Methods;

public class split
{
    public static void main(String[] args)
    {

        String myStr = "Split a string by spaces, and also punctuation.";
        String regex = "[,\\.\\s]";

        // Characters included in this regex:
        // , (comma)
        // \\. (escaped period because . has a special meaning in regex)
        // \\s (whitespace character, which includes spaces, tabs, etc.)

        // Effectively, the string will be split at commas, periods, and whitespace.


        String[] myArray = myStr.split(regex);

        for (String s : myArray)
        {
            System.out.println(s);
        }





    }



}
