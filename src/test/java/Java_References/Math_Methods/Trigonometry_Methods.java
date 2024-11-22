package Java_References.Math_Methods;

public class Trigonometry_Methods
{

    // Returns the sine of a number (angle in radians)
    public static double sine(double radians) {
        return Math.sin(radians);
    }

    // Returns the cosine of a number (angle in radians)
    public static double cosine(double radians) {
        return Math.cos(radians);
    }

    // Returns the tangent of a number (angle in radians)
    public static double tangent(double radians) {
        return Math.tan(radians);
    }

    // Returns the arcsine of a value (result in radians)
    public static double arcsine(double value) {
        return Math.asin(value);
    }

    // Returns the arccosine of a value (result in radians)
    public static double arccosine(double value) {
        return Math.acos(value);
    }

    // Returns the arctangent of a value (result in radians)
    public static double arctangent(double value) {
        return Math.atan(value);
    }

    // Returns the angle theta from the polar coordinates (atan2(y, x))
    public static double arctangent2(double y, double x) {
        return Math.atan2(y, x);
    }

    // Returns the hyperbolic sine of a number
    public static double hyperbolicSine(double value) {
        return Math.sinh(value);
    }

    // Returns the hyperbolic cosine of a number
    public static double hyperbolicCosine(double value) {
        return Math.cosh(value);
    }

    // Returns the hyperbolic tangent of a number
    public static double hyperbolicTangent(double value) {
        return Math.tanh(value);
    }

    // Converts an angle from degrees to radians
    public static double toRadians(double degrees) {
        return Math.toRadians(degrees);
    }

    // Converts an angle from radians to degrees
    public static double toDegrees(double radians) {
        return Math.toDegrees(radians);
    }




    public static void main(String[] args)
    {

        // Example Usage
        double angleDegrees = 45;
        double angleRadians = toRadians(angleDegrees);

        System.out.println("Sine of " + angleDegrees + " degrees: " + sine(angleRadians));
        System.out.println("Cosine of " + angleDegrees + " degrees: " + cosine(angleRadians));
        System.out.println("Tangent of " + angleDegrees + " degrees: " + tangent(angleRadians));

        double value = 0.5;
        System.out.println("Arcsine of " + value + ": " + arcsine(value));
        System.out.println("Arccosine of " + value + ": " + arccosine(value));
        System.out.println("Arctangent of " + value + ": " + arctangent(value));




    }



}
