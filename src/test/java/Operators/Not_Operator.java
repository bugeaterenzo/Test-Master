package Operators;

public class Not_Operator {

    public static void main(String[] args) {


        boolean isAdmin = true; // User is an admin

        // Condition to check if the user is NOT an admin

        if (!isAdmin) {
            System.out.println("Access granted! You can use the features.");
        } else {
            System.out.println("Access denied! Admin users cannot access these features.");
        }




    }



}


