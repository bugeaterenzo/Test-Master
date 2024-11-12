package Java_Assignments_October.Methods;

public class Void_Methods
{
    public void printPattern(int n)
    {



        for (int i = 1; i <= n; i++) {
            // Print spaces for the left padding
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the pyramid
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }



    }

}
