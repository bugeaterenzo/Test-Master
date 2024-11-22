package Java_References.Math_Methods;

public class copy_Sign
{
    public static void main(String[] args) {

        System.out.println(Math.copySign(-4.7, 3));
        System.out.println(Math.copySign(4.7, -2.5));
        System.out.println(Math.copySign(3, 4));
        System.out.println(Math.copySign(-2.5, -4.7));

        // The copySign() method returns the value of the
        // first number with the sign of the second number.
    }
}
