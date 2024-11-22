package Java_References.String_Methods;

public class trim
{
    public static void main(String[] args)
    {


        String myStr = "       Hello     World!       ";

        // use replace() to get rid of spaces between 2 words...!

        System.out.println(myStr);
        System.out.println(myStr.trim());
        System.out.println(myStr.replace(" " , ""));


    }
}
