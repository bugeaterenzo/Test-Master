package Java_References.Math_Methods;

public class round
{
    public static void main(String[] args)
    {
        System.out.println( Math.round(0.5) );
        System.out.println( Math.round(0.4) );
        System.out.println( Math.round(1.5) );
        System.out.println( Math.round(5) );
        System.out.println( Math.round(5.1) );
        System.out.println( Math.round(-5.1) );
        System.out.println( Math.round(-5.9) );


        // round() returns long or int data types while rint() returns a double.
        // When the decimal part of the number is exactly 0.5, rint() returns
        // the nearest even integer while round() returns the highest of the two nearest integers


        System.out.println("\n**********************************************\n");


        System.out.println( Math.rint(0.5) );
        System.out.println( Math.rint(0.4) );
        System.out.println( Math.rint(1.5) );
        System.out.println( Math.rint(5) );
        System.out.println( Math.rint(5.1) );
        System.out.println( Math.rint(-5.1) );
        System.out.println( Math.rint(-5.9) );




    }





}
