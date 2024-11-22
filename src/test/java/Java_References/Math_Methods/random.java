package Java_References.Math_Methods;

import java.util.Random;

public class random
{
    public static void main(String[] args)
    {

        System.out.println(Math.random());

        // Generate a 3-digit random number
        int randomThreeDigit = (int)(Math.random() * 900) + 100;

        // Print the random number
        System.out.println("Random 3-digit number: " + randomThreeDigit);

        // Create an instance of Random class
        Random random = new Random();

        // Generate a 3-digit random number
        int randomThree_Digit = random.nextInt(900) + 100;

        // Print the random number
        System.out.println("Random 3-digit number: " + randomThree_Digit);


        // Math.random():

        // Internally, it uses an instance of java.util.Random
        // that is shared across the application.
        // Generates pseudo-random numbers using a single, shared seed.

        // Random Class:

        // Creates an independent instance with its own seed.
        // Allows you to control the randomness by providing your own seed
        // (useful for reproducibility in testing).
    }
}
