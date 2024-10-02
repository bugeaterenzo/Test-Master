package Variables;

public class Variable_Swapping {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Swapping the values without using a third variable
        a = a + b; // a becomes 15 (5 + 10)
        b = a - b; // b becomes 5 (15 - 10)
        a = a - b; // a becomes 10 (15 - 5)

        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
