package September_03_Assignments.String_Methods;

public class equals {

    public static void main (String[] args) {


//        Question 1: Basic String Comparison

        String greeting_1 = "Hello";
        String greeting_2 = "Hello";

        boolean result_1 = greeting_1.equals(greeting_2);




//        *********** *********** *********** *********** *********** *********** ***********




//        Question 2: Case Sensitivity Check


        String word_1 = "Java";
        String word_2 = "java";

        boolean result_2 = word_1.equals(word_2);



//        *********** *********** *********** *********** *********** *********** ***********



//    Question 3: Comparing with an Empty String


        String string_1 = "";      // Empty String (""): A string with no characters. Its length is 0.
        String string_2 = " ";       // Space String (" "): A string with a single space character. Its length is 1.

        boolean result_3 = string_1.equals(string_2);



//        *********** *********** *********** *********** *********** *********** ***********



//        Question 4: Comparing with a Variable


        String word_3 = "Programming";
        String word_4 = "Programming";

        boolean result_4 = word_3.equals(word_4);





//        *********** *********** *********** *********** *********** *********** ***********



//        Question 5: Comparing Strings with Different Lengths


        String string_3 = "JavaScript";
        String string_4 = "Java";

        boolean result_5 = string_3.equals(string_4);




//        *********** *********** *********** *********** *********** *********** ***********



//        Question 6: Case-Insensitive Comparison


        String word_5 = "Java Programming";
        String word_6 = "java programming";

        boolean result_6 = word_5.equals(word_6);




//        *********** *********** *********** *********** *********** *********** ***********



//        Question 7: Comparing Strings with Leading or Trailing Spaces


        String string_5 = " Hello ";
        String string_6 = "Hello";

        boolean result_7 = string_5.trim().equals(string_6.trim());





//        *********** *********** *********** *********** *********** *********** ***********



//        Question 8: Dynamic String Comparison


        String word_7 = "OpenAI";
        String word_8 = "openai";

        boolean result_8 = word_7.equals(word_8);




//        *********** *********** *********** *********** *********** *********** ***********



//        Question 9: Checking for Null Strings


        String string_9 = "";
        String string_10 = "null";

        boolean result_9 = string_9.equals(string_10);





//        *********** *********** *********** *********** *********** *********** ***********



//        Question 10: Comparing Substrings for Equality


        String word_9 = "Welcome to Java Programming";
        String word_10 = "java";

        boolean result_10 = word_9.substring(11,16).equals(word_10);



        System.out.println(result_10);









    }
}
