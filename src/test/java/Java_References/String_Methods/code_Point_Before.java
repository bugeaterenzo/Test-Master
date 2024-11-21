package Java_References.String_Methods;

public class code_Point_Before
{
    public static void main(String[] args)
    {
        String myStr = "Hello";
        int result = myStr.codePointBefore(1);

        // the Unicode value of "H" is 72
        System.out.println(result);
    }
}
