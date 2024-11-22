package Java_References.Math_Methods;

public class exponent
{
    public static void main(String[] args)
    {
        System.out.println(Math.exp(0));
        System.out.println(Math.exp(1));
        System.out.println(Math.exp(10));
        System.out.println(Math.exp(4.8));
        System.out.println(Math.exp(Math.E));


        // The exp() method returns e raised to the power of a number (ex).

        // e is the base of the natural system of logarithms (approximately 2.718282).
        // In Java, the value of e is available as the constant Math.E.


        // The expm1() method returns the solution to ex - 1 for any number x.

        System.out.println(Math.expm1(0));
        System.out.println(Math.expm1(1));
        System.out.println(Math.expm1(10));
        System.out.println(Math.expm1(4.8));
        System.out.println(Math.expm1(Math.E));


    }


}
