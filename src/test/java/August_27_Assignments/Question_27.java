


//  Question 27: Converting Minutes to Hours and Minutes


package August_27_Assignments;

public class Question_27 {




    public static void main (String[] args) {


    int totalMinutes = 135;


    double hours = totalMinutes / 60;
    int minutes = totalMinutes % 60;

    System.out.println( (int)hours + " Hours and " + minutes + " Minutes");


//      wrong  method right result
        String result = Double.toString(hours);



        char[] seperated_result = result.toCharArray();



        for ( int i = 0 ;  i < seperated_result.length; i++) {

            char c = seperated_result[i];
            if (c == '.') {
                seperated_result[i] = ':';
            }




        }


        boolean next_group = false;

        for (int x = 0; x < seperated_result.length; x++) {

            char c = seperated_result[x];

            if (c != ':') System.out.print(seperated_result[x]);

            if (c == ':')
            {
                next_group = true;

                if(next_group == true)
                {
                    System.out.print(" Hours and ");
                    break;
                }

            }


        }

        System.out.println( minutes + " Minutes ");




        }

    }






