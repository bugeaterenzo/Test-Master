package Java_References.String_Methods;

public class contains
{
    public static void main(String[] args)
    {
        String myStr = "Hello";
        System.out.println( myStr.contains("Hel") );   // true
        System.out.println( myStr.contains("e") );     // true
        System.out.println( myStr.contains("Hi") );    // false
    }
}
