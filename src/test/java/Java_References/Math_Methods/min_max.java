package Java_References.Math_Methods;

public class min_max
{
    public static void main(String[] args)
    {
        System.out.println(Math.min(2.0, 0.25));
        System.out.println(Math.min(31.2f, 18.0f));
        System.out.println(Math.min(14, 22));
        System.out.println(Math.min(96L, 2048L));

        System.out.println("\n***********************************************\n");

        System.out.println(Math.max(2.0, 0.25));
        System.out.println(Math.max(31.2f, 18.0f));
        System.out.println(Math.max(14, 22));
        System.out.println(Math.max(96L, 2048L));

        //int max = (n -> (Math::max));
    }
}
