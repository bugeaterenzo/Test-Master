package Java_Assignments_October.Loops;

public class Prime_Number_Checker {


    public static void main(String[] args) {





        int n = 13;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            // Check divisibility from 2 up to sqrt(n)
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false; // If divisible by any number, it's not prime
                    break;
                }
            }
        }

// Output result
        if (isPrime) {
            System.out.println(n + " is a prime number!");
        } else {
            System.out.println(n + " is not a prime number!");
        }













    }



}
