package Java_References.String_Methods;

public class ends_With
{
    public static void main(String[] args)
    {
        String myStr = "Hello";

        System.out.println(myStr.endsWith("Hel"));   // false
        System.out.println(myStr.endsWith("llo"));   // true
        System.out.println(myStr.endsWith("o"));     // true
    }
}
