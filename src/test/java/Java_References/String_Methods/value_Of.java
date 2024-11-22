package Java_References.String_Methods;

public class value_Of
{
    public static void main(String[] args)
    {

        char[] myArray = {'a', 'b', 'c'};
        System.out.println( String.valueOf(myArray) );
        System.out.println( String.valueOf('A') );
        System.out.println( String.valueOf(true) );
        System.out.println( String.valueOf(4.5f) );
        System.out.println( String.valueOf(5.2) );
        System.out.println( String.valueOf(12) );
        System.out.println( String.valueOf(1400L) );

        // use toString() method to handle null values safely...!
        System.out.println(String.valueOf(null));

    }


}
