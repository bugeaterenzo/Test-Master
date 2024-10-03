package Java_Assignments_October.Conditionals;

public class Nested_Conditions {

    public static void main(String[] args) {


        boolean hasWeapon = true;
        double energyLevel = 45.90;

        if ( hasWeapon && energyLevel > 50 )
        {
            System.out.println(" Attack the enemy! ");
        }
        else if ( hasWeapon && energyLevel < 50 )
        {
            System.out.println(" Need more energy to attack. ");
        }
        else if ( hasWeapon == false )
        {
            System.out.println(" Find a weapon first! ");
        }


    }

}
