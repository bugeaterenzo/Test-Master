package September_03_Assignments.String_Methods;

import java.util.ArrayList;

public class Substring {

    public static void main (String[] args)
    {


//        Question 1: Extracting a Simple Substring

        String word_1 = "Programming";
        String word_2 = word_1.substring(0 , 7);




//        Question 2: Substring from a Specific Position

        String word_3 = "JavaDeveloper";
        //String word_4 = word_3.substring(14 , 17);





//        Question 3: Substring to Reverse a String

        String word_5 = "ReverseMe";
        String word_6 =   word_5.substring(7 , 9) + word_5.substring(0 , 7);





//        Question 4: Finding Substrings within a String


        String word_7 = "OpenAI is awesome!";
        int index_1 = word_7.indexOf("A");
        int index_2 = word_7.indexOf("I");
        String word_8 =   word_7.substring(index_1 , index_2+1 ) ;





//        Question 5: Extracting Initials

        String word_9 = "John Doe";
        int index_3 = word_9.indexOf("J");
        int index_4 = word_9.indexOf("D");
        String word_10 =   word_9.substring(index_3 ,++index_3 ) + word_9.substring(index_4 ,++index_4 ) ;





//        Question 6: Substring Puzzle


        String word_11= "abcdefgh";
        String word_12 = word_11.substring(4 ,8 ) + word_11.substring(0 ,4 );





//        Question 7: Conditional Substring Extraction


        String word_13 = "WelcomeToJavaProgramming";
        int length = word_13.length();

        if( length % 2 == 0 )
        {
            int first_half = length / 2;
            //System.out.println(word_13.substring( 0 , first_half ));
        }
        else
        {
            //System.out.println(word_13.substring(0 ,3 ));
        }



//        Question 8: Finding Overlapping Substringsd


        String word_14 = "bananas";

        char[] fruits = word_14.toCharArray();


        String word_15 =   word_14.substring(1 , 4) ;

        String word_16 =   word_14.substring(3 , 6) ;

        if (word_15.equals("ana") && word_16.equals("ana") )
        {
            //System.out.println("a");
            //System.out.println("a");
        }





//         Question 9: Substring from a Dynamic Index


        String word_17= "Let's learn Java";

        char[] chars = word_17.toCharArray();


        int e_counter = 0;

        ArrayList<String> charList = new ArrayList<>();


        for ( int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'e')
            {
                ++e_counter;
                String message = (e_counter == 1) ? "First e is found...!" : "Second e is found...!";
                System.out.println(message);

                    if ( e_counter == 2 && chars[i] != ' ' )
                    {
                        // int a = word_17.indexOf(chars[i]); why is not working?
                        // The method indexOf(char) in Java returns the first
                        // occurrence of the character within a string.

                        System.out.println("We are at index : " + i);
                        int a = word_17.indexOf(chars[i], i);
                        System.out.println("The second E is fount at index : " + a);

                        // If you want to get the index of subsequent occurrences of 'e',
                        // you need to use the overloaded version of indexOf(), which takes
                        // a second argument: indexOf(char ch, int fromIndex).
                        //This version of indexOf() starts looking for the character
                        // from a specified position in the string (instead of always
                        // starting from the beginning). This allows you to find the
                        // second, third, etc., occurrences of a character.

                        String char_from_substring = word_17.substring( a );

                        charList.add(char_from_substring);
                    }

            }
        }

        System.out.println(charList);












    }
}
