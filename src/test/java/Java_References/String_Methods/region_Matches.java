package Java_References.String_Methods;

public class region_Matches
{
    public static void main(String[] args)
    {


        String myStr1 = "Hello, World!";
        String myStr2 = "New World";

        System.out.println(myStr1.regionMatches(7, myStr2, 4, 5));
        System.out.println(myStr1.regionMatches(0, myStr2, 0, 5));


    }



}
