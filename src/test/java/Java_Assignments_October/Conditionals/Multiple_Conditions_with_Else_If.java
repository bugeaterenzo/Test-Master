package Java_Assignments_October.Conditionals;

public class Multiple_Conditions_with_Else_If {

    public static void main(String[] args) {

        int grade = 90;

        if ( grade >= 90 )
        {
            System.out.println(" A ");
        }
        else if ( grade > 80  && grade < 89  )
        {
            System.out.println(" B ");
        }
        else if ( grade > 70  && grade < 79  )
        {
            System.out.println(" C ");
        }
        else if ( grade > 60  && grade < 69  )
        {
            System.out.println(" D ");
        }
        else if ( grade < 60 )
        {
            System.out.println(" Fail ");
        }
    }



}
