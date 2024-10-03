package Java_Assignments_October.Conditionals;

public class Ternary_Operator {

    public static void main(String[] args) {

        boolean is_member = true;
        double price = 90.60;

        double discount = price * 10 / 100;

        double total = price - discount;

       String message =  ( is_member ) ? " You recieved 10% discount total price is : " + total :
                                        " you are not a member you dont recieve a discount ";


        System.out.println( message );



    }

}
