package September_03_Assignments.String_Methods;

import java.util.Scanner;

public class Equality {


    public static void main (String[] args) {

//        Question 1: Basic Usage of length()

        String word_1 = "JavaProgramming";
        int length_1 = word_1.length();



//        Question 2: length() with an Empty String

        String word_2 = "";
        int length_2 = word_2.length();




//        Question 3: length() with Spaces

        String word_3 = "Java Programming";
        int length_3 = word_3.length();




//        Question 4: Combining Strings and Finding Length

        String word_4 = "Hello";
        String word_5 = "World";
        String word_6 = word_4 + word_5;
        int length_4 = word_6.length();



//        Question 5: Analyzing Length of User Input

        var in = new Scanner(System.in);

        //System.out.print(" Give a word to find the length : ");
        //String word_7 = in.next();
        //int length_5 = word_7.length();



//         Question 6: Hidden Lengths

        String word_8 = " Java ";
        int length_6 = word_8.length();





//        Question 7: Length Comparison

        String word_9 = "Hello";
        int length_7 = word_9.length();

        String word_10 = "world";
        int length_8 = word_10.length();

        String result_1 = (length_7 > length_8) ? ( word_9 + " is bigger then " + word_10 ) : ( (length_7 == length_8) ? "They are equal..!" : ( word_9 + " is smaller then " + word_10 ) ) ;





//        Question 8: Dynamic String Lengths

        String word_11 = "Java";
        String word_12 = word_11 + "Programming";
        int length_9 = word_12.length();






//        Question 9: Counting Specific Characters

        String word_13 = "abracadabra";
        int length_10 = word_13.length();

        char[] characters = word_13.toCharArray();

        int counter = 0;

        for ( char C  : characters)
        {
            if (C=='a')
            {
                counter++;
            }
        }

        word_13 = word_13.replaceAll("a" , "");
        int length_11 = word_13.length();





//        Question 10: Detecting Empty Strings

        String word_14 = "";
        int length_12 = word_14.length();

        if (length_12 == 0)
        {
            System.out.println("String is empty..!");
        }
        else
        {
            System.out.println(length_12);
        }






        System.out.println();

    }


}
