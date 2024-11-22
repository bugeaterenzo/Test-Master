package Java_References.Math_Methods;

public class increment_Exact
{
    public static void main(String[] args)
    {

        // The incrementExact() method returns 1 more than a specified integer and throws
        // an exception if an overflow occurs. This prevents incorrect
        // results that can occur from the overflow.
        System.out.println(Math.incrementExact(12002));
        System.out.println(Math.incrementExact(18));
        System.out.println(Math.incrementExact(32));
        System.out.println(Math.incrementExact(947));

    }


}
