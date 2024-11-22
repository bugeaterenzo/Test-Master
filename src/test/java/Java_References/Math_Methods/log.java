package Java_References.Math_Methods;

public class log
{
    public static void main(String[] args)
    {


        // The log() method returns the natural logarithm of a number.
        // The natural logarithm is the logarithm with base e.
        // The value of e is approximately 2.718282 and it is available as the constant Math.E in Java.

        System.out.println(Math.log(6));
        System.out.println(Math.log(Math.E));
        System.out.println(Math.log(2));
        System.out.println(Math.log(1));
        System.out.println(Math.log(0));
        System.out.println(Math.log(-1));

        System.out.println("\n***********************************************\n");

        // The log10() method returns the base 10 logarithm of a number.

        System.out.println(Math.log10(120));
        System.out.println(Math.log10(10));
        System.out.println(Math.log10(3.1623));
        System.out.println(Math.log10(1));
        System.out.println(Math.log10(0));
        System.out.println(Math.log10(-1));

        System.out.println("\n***********************************************\n");

        // The log1p() method returns the natural logarithm of 1 + x for any number x.

        System.out.println(Math.log1p(6));
        System.out.println(Math.log1p(Math.E));
        System.out.println(Math.log1p(2));
        System.out.println(Math.log1p(1));
        System.out.println(Math.log1p(0));
        System.out.println(Math.log1p(-1));


    }


}
