package Java_References.String_Methods;

public class format
{
    public static void main(String[] args)
    {


        String myStr  = "Hello %s! One kilobyte is %,d bytes.";

        // %s: This is a placeholder for a String value.
        // %,d: This is a placeholder for an integer value, and the comma ,
        // indicates that the number should be formatted with grouping for thousands.

        String result = String.format(myStr, "World", 1024);

        System.out.println(result);


        // %,d applies the grouping separator ( , )
        // to the number for every three digits, starting from the right.
        // It ensures that large numbers are easier to read.

        int number_1 = 1234567;
        System.out.println(String.format("%,d", number_1)); // Output: 1,234,567

        long number_2 = 9876543210l; // 9.8 billion
        System.out.println(String.format("%,d", number_2)); // Output: 9,876,543,210


    }
}
