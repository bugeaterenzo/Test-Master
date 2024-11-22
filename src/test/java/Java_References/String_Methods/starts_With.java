package Java_References.String_Methods;

public class starts_With
{

    public static void main(String[] args)
    {

        String myStr = "Hello";

        System.out.println(myStr.startsWith("Hel"));   // true
        System.out.println(myStr.startsWith("llo"));   // false
        System.out.println(myStr.startsWith("o"));     // false

    }



}
