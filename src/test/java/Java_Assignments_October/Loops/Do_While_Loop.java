package Java_Assignments_October.Loops;

import java.util.Scanner;

public class Do_While_Loop {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int attemps = 3;
        int pin = 0;

        do
        {

            System.out.print("Pin : ");
            pin = input.nextInt();

            if (pin != 1234 )
            {
                attemps--;

                if (attemps == 1) {
                    System.out.println(" Wrong pin. Last try !");
                }
                else if (attemps == 0 ) {
                    System.out.println("Wrong pin. Card Blocked!");
                }else {
                    System.out.println("Wrong pin. Try again!");
                }

            }else
            {
                System.out.println("Access Granted!");
                break;
            }

        }while ( attemps >=1 );










    }






}
