package September_03_Assignments.String_Methods;

public class ToUpperCase {
    public static void main (String[] args)
    {

//        Question 1: Basic Conversion

        String word_1 = "hello world";
        word_1 = word_1.toUpperCase();




//        Question 2: Mixed Case Conversion

        String word_2 = "java programming";
        word_2 = word_2.toUpperCase();




//        Question 3: Conversion with Numbers

        String word_3 = "java123";
        word_3 = word_3.toUpperCase();




//        Question 4: Handling Special Characters

        String word_4 = "welcome@2024";
        word_4 = word_4.toUpperCase();




//        Question 5: Case Insensitivity Check

        String word_5 = "hello";
        word_5 = word_5.toUpperCase();

        String word_6 = "Hello";
        word_6 = word_6.toUpperCase();

        boolean result_1 = ( word_5.equals(word_6)) ? true : false;





//        Question 6: Case Conversion and Replacement

        String word_7 = "text and more text";
        word_7 = word_7.toUpperCase().replaceAll("TEXT" , "Data");





//        Question 7: Checking Palindrome Ignoring Case

        String word_8 = "Racecar";
        word_8 = word_8.toUpperCase();

        String result_2 = (word_8.equals("RACECAR")) ? "They are Palindrome" : "They are not Palindrome";




//        Question 8: Case-Insensitive Substring Check

        String word_9 = "hello world";
        word_9 = word_9.toUpperCase();

        String word_10 = "WORLD";
        word_10 = word_10.toUpperCase();

        boolean result_3 = ( word_9.substring( 6 , 11 ).contains(word_10) ) ? true : false;






//        Question 9: Dynamic Case Conversion

        String word_11 = "toggle case";  //  TOGGLE CaSE   toggle case   Toggle case


        String message = "No conversion needed : ";


        if (word_11.equals(word_11.toUpperCase()))
        {
              //System.out.println(message + word_11 );
        }
        else
        {
            word_11 = word_11.toUpperCase();
            //System.out.println(" Converted to : " + word_11);
        }




//        Question 10: Complex Case Manipulation

        String word_12 = "AbCdEfGhIj";
        word_12 = word_12.toUpperCase();

        int word_counter = 1; // this is necessary..!

        for ( int i = 0; i < word_12.length(); i++)
        {
            if ( word_counter % 4 == 0  )
            {
               char a = word_12.charAt(i);
               word_12 = word_12.replace( a , '*');
            }
            word_counter++;
        }

        System.out.println(word_12);


    }
}
