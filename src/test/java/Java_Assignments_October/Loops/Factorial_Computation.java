package Java_Assignments_October.Loops;

public class Factorial_Computation {


    public static void main(String[] args) {


        int n = 4;

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);


    }


}
