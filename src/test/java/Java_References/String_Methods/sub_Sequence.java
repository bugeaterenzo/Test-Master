package Java_References.String_Methods;

public class sub_Sequence
{
    public static void main(String[] args)
    {


        String myStr = "Hello, World!";

        System.out.println(myStr.subSequence(7, 12));

        // subSequence() is part of the CharSequence interface
        // and can be used with any type that implements CharSequence,
        // including String, StringBuilder, and StringBuffer.

        StringBuilder sb = new StringBuilder("Hello, World!");

        CharSequence result2 = sb.subSequence(7, 12); // Works with StringBuilder

        System.out.println(result2); // Outputs: "World"



    }
}
