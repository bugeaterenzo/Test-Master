package Java_References.Math_Methods;

public class Exact_Methods
{
    public static void main(String[] args)
    {


        // add
        System.out.println(Math.addExact(12, 16));
        System.out.println(Math.addExact(10000, 24060));
        System.out.println(Math.addExact(45 , 9900));

        System.out.println("\n***********************************************\n");

        // The negateExact() method returns an integer with equal value and opposite
        // sign to another integer and throws an exception if an overflow occurs.
        // This prevents incorrect results that can occur from the overflow.

        // negate
        System.out.println(Math.negateExact(15));
        System.out.println(Math.negateExact(-32));
        System.out.println(Math.negateExact(7));
        System.out.println(Math.negateExact(-25));

        System.out.println("\n***********************************************\n");

        // multiply
        System.out.println(Math.multiplyExact(96000, 1200));
        System.out.println(Math.multiplyExact(-460, 95));

        System.out.println("\n***********************************************\n");

        // divide
        System.out.println(Math.subtractExact(12, 16));
        System.out.println(Math.subtractExact(24060, 10000));


    }
}
