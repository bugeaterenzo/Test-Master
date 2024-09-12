package Practice_Java;

import java.util.Scanner;

public class Complex_Classwork {


    public static void main (String[] args) {


        System.out.println(" 1: Enter Items     " +
                "2: Display Total       " +
                "3: Display Min     " +
                "4: Display Max     " +
                "5: Display Average     " +
                "6: Exit" );

        var in = new Scanner(System.in);

        int choice = in.nextInt();


        if (choice == 1){
            System.out.print(" how many items? ");
            ask_price();
        }







    }








public static void ask_price(){


    var in = new Scanner(System.in);

    int x = 1;


    int lenght = in.nextInt();

    int[] prices = new int[lenght];

    for ( int i = 0; i < prices.length ; i++ ) {

        System.out.print("Item " + x  + " price :");
        int price = in.nextInt();
        prices[i] = price;
        x++;

        if ( i == prices.length - 1)
        {
            System.out.print("Do you want to add more items ? yes/no");
            String answer =  in.next().toLowerCase();
            if (answer.equals("yes"))
            {
                ask_price();
            }
            else
            {
                break;
            }
        }

    }




}


}
