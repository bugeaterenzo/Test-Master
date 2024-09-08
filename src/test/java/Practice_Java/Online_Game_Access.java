package Practice_Java;

import java.util.Scanner;

public class Online_Game_Access {


    public static void main (String[] args){

        var input = new Scanner(System.in);

        System.out.println("Are you a VIP member ?");
        System.out.println("Enter yes or no !");

        String is_vip = input.next().toLowerCase();

        boolean isVip = (is_vip.equals("yes"))  ? true : false;


        System.out.println("How many hours have you played ?");

        int numberOfHoursPlayed = input.nextInt();



        if ( isVip == true || numberOfHoursPlayed > 100) {
            System.out.println("Access Granted...!");
        } else {
            System.out.println("Access Denied...!");
        }


    }


}
