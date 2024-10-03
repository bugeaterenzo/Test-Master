package Java_Assignments_October.Operators;

public class Combined_Operators {

    public static void main(String[] args) {


        boolean knowsHandshake = true; // Person knows the handshake
        boolean knowsPassword = true;   // Person knows the password

        // Determine if the person should be allowed entry or is a spy

        if (knowsHandshake && knowsPassword)
        {
            System.out.println("You are considered a spy!");
        }
        else if (knowsHandshake || knowsPassword)
        {
            System.out.println("Access granted! You may enter the club.");
        }
        else
        {
            System.out.println("Access denied! You cannot enter the club.");
        }



        // Determine if the person should be allowed entry or is a spy using XOR

        if (knowsHandshake ^ knowsPassword)
        {
            System.out.println("Access granted! You may enter the club.");
        }
        else
        {
            System.out.println("You are considered a spy!");
        }


    }


}
