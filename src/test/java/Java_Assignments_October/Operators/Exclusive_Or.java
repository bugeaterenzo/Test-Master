package Java_Assignments_October.Operators;

public class Exclusive_Or {

    public static void main(String[] args) {

        boolean switchA = true;
        boolean switchB = false;

        String light_On = "is_On";
        String light_Off = "is_Off";

//        Understanding the Expression if ( switchA == true ^  switchB == false ) :
//        Operator Precedence: The == operator has a higher precedence than the ^ operator.
//        This means that Java evaluates switchA == true and switchB == false first, before
//        applying the XOR operation.
//
//        How It Evaluates:
//        switchA == true evaluates to a boolean value (true or false).
//        switchB == false also evaluates to a boolean value (true or false).
//        After both comparisons are evaluated, the ^ operator is applied to these two boolean results.
//        Example Breakdown

//        Assuming:
//        switchA = true
//        switchB = false

//        Here’s how the expression would be evaluated:

//        switchA == true evaluates to true.
//        switchB == false evaluates to true.
//        The final expression becomes true ^ true, which evaluates to false.

        if ( switchA ^ switchB )
        {
            System.out.println(light_On);
        }
        else
        {
            System.out.println(light_Off);
        }


    }

}
