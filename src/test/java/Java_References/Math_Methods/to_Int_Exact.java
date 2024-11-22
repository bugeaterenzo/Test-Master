package Java_References.Math_Methods;

public class to_Int_Exact
{
    public static void main(String[] args)
    {


        // The toIntExact() method Converts a long value to an int
        // and throws an exception if the conversion results in an overflow.
        // This prevents incorrect results that can occur from the overflow.

        System.out.println(Math.toIntExact(1500000L));
        System.out.println(Math.toIntExact(-32L));
        System.out.println(Math.toIntExact(-86345L));
        System.out.println(Math.toIntExact(25L));
        System.out.println(Math.toIntExact(250000000000000L));

    }
}
