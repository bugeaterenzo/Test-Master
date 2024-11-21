package Java_References.String_Methods;

public class get_Bytes
{
    public static void main(String[] args)
    {

        String myStr = "Hello";

        // In the default encoding (UTF-8), the characters of "Hello"
        // are encoded as follows (based on their ASCII values):

        // 'H': ASCII value 72
        // 'e': ASCII value 101
        // 'l': ASCII value 108
        // 'l': ASCII value 108
        // 'o': ASCII value 111

        // byte[] result = {72, 101, 108, 108, 111};

        byte[] result = myStr.getBytes();

        System.out.println(result[0]); // result 72



    }





}
