package September_03_Assignments.String_Methods;

public class ToLowerCase {

    public static void main (String[] args)
    {


//        Question 1: Basic Conversion

        String word_1 = "HELLO WORLD";
        word_1 = word_1.toLowerCase();




//        Question 2: Mixed Case Conversion

        String word_2 = "JaVa PrOgRaMmInG";
        word_2 = word_2.toLowerCase();



//        Question 3: Conversion with Numbers

        String word_3 = "Java123";
        word_3 = word_3.toLowerCase();




//        Question 4: Handling Special Characters

        String word_4 = "Welcome@2024";
        word_4 = word_4.toLowerCase();


//        Question 5: Case Insensitivity Check

        String word_5 = "HELLO";
        word_5 = word_5.toLowerCase();

        String word_6 = "Hello";
        word_6 = word_6.toLowerCase();

        boolean result_1 = ( word_5.equals(word_6)) ? true : false;



//        Question 6: Case Conversion and Replacement

        String word_7 = "TeXT aND mORe TeXT";
        word_7 = word_7.toLowerCase().replaceAll("text" , "data");




//        Question 7: Checking Palindrome Ignoring Case



        String word_8 = "Madam";


        String lowerStr = word_8.toLowerCase();

        // Initialize a reverse string
        String reversedStr = "";

        // Reverse the string
        for (int i = lowerStr.length() - 1; i >= 0; i--) {
            reversedStr += lowerStr.charAt(i);
        }

        // System.out.println(reversedStr);

        // Check if the original string (lowercase) is equal to the reversed string
        if (lowerStr.equals(reversedStr)) {
            // System.out.println( word_8 + " is a palindrome." );
        } else {
           //  System.out.println( word_8 + " is not a palindrome." );
        }



//        Question 8: Case-Insensitive Substring Check

        String word_9 = "Hello World";
        word_9 = word_9.toLowerCase();

        String word_10 = "world";
        word_10 = word_10.toLowerCase();



        boolean result_2 = ( word_9.substring( 6 , 11 ).equals(word_10) ) ? true : false;



//        Question 9: Dynamic Case Conversion

        // The following code works fine but includes unnecessary code in it
        // the precise code is in ToUpperCase.java file

        String word_11 = "TOGGLE CASe";  //  aaaaaaa



        boolean is_lower_case = true;

        char[] check_char = word_11.toCharArray();

        String message = "No conversion needed : ";

        for ( int i = 0; i < check_char.length; i++ )
        {
            if ( !Character.isLowerCase( check_char[i] )  )
            {
                is_lower_case = false;
                break;
            }

        }

        if (is_lower_case)
        {
             System.out.println(message + word_11 );
        }
        else
        {
            word_11 = word_11.toLowerCase();
            System.out.println(" Converted to : " + word_11);
        }





//        Question 10: Complex Case Manipulation


        String word_12 = "aBcDeFgHiJ";
        word_12 = word_12.toLowerCase();

        char[] word_to_char = word_12.toCharArray();

        int index = 0;

        for( int i = 0; i < word_to_char.length; i++)
        {
            index = i;
            if ( ( (++index) % 3 == 0) )
            {
                word_to_char[i] = '*';
            }
        }


        for( char character : word_to_char )
        {
            System.out.print(character);
        }




        System.out.println();


    }

}
