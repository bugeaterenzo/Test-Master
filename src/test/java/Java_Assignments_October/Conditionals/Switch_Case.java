package Java_Assignments_October.Conditionals;

public class Switch_Case {

    public static void main(String[] args) {


        int dayOfWeek = 5;

        String message = "Invalid day value";


        switch (dayOfWeek)
        {
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println(message);
        }



    }

}
