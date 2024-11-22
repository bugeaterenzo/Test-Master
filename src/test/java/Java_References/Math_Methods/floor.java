package Java_References.Math_Methods;

public class floor
{
    public static void main(String[] args)
    {


        // The floor() method rounds a number DOWN to the nearest integer.

        System.out.println(Math.floor(0.60));
        System.out.println(Math.floor(0.40));
        System.out.println(Math.floor(5));
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(-5.1));
        System.out.println(Math.floor(-5.9));


        // The floorDiv() method returns the division between two integers rounded down.
        // This is different from an ordinary integer division in that negative results
        // are rounded down away from zero instead of truncated towards it.

        System.out.println(Math.floorDiv(10, 5));
        System.out.println(Math.floorDiv(10, 4));
        System.out.println(Math.floorDiv(-10, 4));
        System.out.println(Math.floorDiv(-10, 5));


        // The floorMod() method returns the remainder of a division between two integers
        // where the result of the division was rounded down.

        System.out.println(Math.floorMod(10, 4));
        System.out.println(Math.floorMod(-10, 4));
        System.out.println(Math.floorMod(10, 3));

        // the formula:
        // Compute -10 / 3 = -3.3333 take floor of it which is -4
        // floorMod(−10,3) = −10 − ( 3⋅  −4 ) = −10 + 12 = 2

        System.out.println(Math.floorMod(-10, 3));


    }
}
