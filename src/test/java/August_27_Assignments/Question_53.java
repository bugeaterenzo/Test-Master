

//  Question 53: Calculating Total Price


package August_27_Assignments;

import java.util.Scanner;

public class Question_53 {

    public static void main (String[] args) {


        var input = new Scanner(System.in);

        System.out.print("Enter quantity  : ");
        double quantity = input.nextDouble();

        System.out.print("Enter pricePerItem  : ");
        double pricePerItem = input.nextDouble();

        double total_price = quantity * pricePerItem;

        System.out.println(total_price);




    }

}
