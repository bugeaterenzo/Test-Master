package Java_Assignments_October.Loops;

public class While_Loop {


    public static void main(String[] args)
    {

        int cookies_eaten = 0;
        int total_cookies = 20;
        int days_last = 0;

        System.out.println(cookies_eaten + "   " + total_cookies + "   " + days_last);

        while ( cookies_eaten < 20 )
        {
            cookies_eaten+=2;
            total_cookies-=2;
            days_last++;
            System.out.println(cookies_eaten + "   " + total_cookies + "   " + days_last);

        }

        System.out.println(days_last);




    }


}
