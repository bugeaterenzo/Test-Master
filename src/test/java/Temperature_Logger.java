

import java.util.Scanner;


public class Temperature_Logger {



    public static void main (String[] args){

        var input = new Scanner(System.in);



        int[] weekly_temp = new int[7];


        int day = 0 ;

        for (int i = 0; i < weekly_temp.length; i++){


            System.out.print("Please enter weekly temperature value for day " + ++day + "  " );

            int temp_value = input.nextInt();

            weekly_temp[i] = temp_value;

        }

        System.out.print("which days temperature do you want to receive?  ");
        int day_num = input.nextInt();

        switch (day_num){
            case 1:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            case 2:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            case 3:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            case 4:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            case 5:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            case 6:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            case 7:
                System.out.print(" The Temperature for the day " + day_num + " is " + weekly_temp[--day_num] + "°C !" );
                break;
            default:
                System.out.print("There is 7 days in a week please retry again!");
        }








    }


}
