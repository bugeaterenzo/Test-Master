import java.util.Arrays;
import java.util.Scanner;

public class Shopping_Cart {


    public static void main (String[] args){


        var input = new Scanner(System.in);



        int[] Shopping_cart = new int[3];

        System.out.println("Please enter Product prices !");



        int price_sum = 0;

        for( int i = 0; i < Shopping_cart.length; i++){

            System.out.print( "Product " + (i+1) + " Price : " );
            int prices = input.nextInt();

            Shopping_cart[i] = prices;
            price_sum += Shopping_cart[i];

        }


        System.out.println("The total cost is : " + price_sum);

//      ---------------------------------------------------------------------------------------


        Arrays.sort(Shopping_cart);
        System.out.println("Minimum Price : " + Shopping_cart[0]);
        System.out.println("Maximum Price : " + Shopping_cart[Shopping_cart.length - 1]);


//      ---------------------------------------------------------------------------------------


        System.out.println("Minimum Price : " + Arrays.stream(Shopping_cart).min().getAsInt());
        System.out.println("Maximum Price : " + Arrays.stream(Shopping_cart).max().getAsInt());









    }


}
