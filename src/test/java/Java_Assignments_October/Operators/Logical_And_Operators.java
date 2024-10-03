package Java_Assignments_October.Operators;

public class Logical_And_Operators {

    public static void main(String[] args)
    {
        boolean isPasswordCorrect = true;
        boolean isAdmin = true;

        if ( isPasswordCorrect && isAdmin )
        {
            System.out.println("Door_Open");
        }
        else
        {
            System.out.println("Door_Closed");
        }

        boolean goldKey = true; // Player has the gold key
        String password = "OpenSesame"; // Player's entered password

        // Condition to check if the player can enter the room
        if (goldKey && password.equals("OpenSesame")) {
            System.out.println("Access granted! You may enter the secret room.");
        } else {
            System.out.println("Access denied! You cannot enter the secret room.");
        }

    }

}
