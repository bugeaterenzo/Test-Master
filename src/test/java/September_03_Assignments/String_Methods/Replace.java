package September_03_Assignments.String_Methods;

public class Replace {


    public static void main (String[] args) {


//      Question 1: Simple Replacement

        String word_1 = "Hello World";
        String word_2 = word_1.replace("World" , "Java");



//      Question 2: Replacing Characters

        String word_3 = "banana";
        String word_4 = word_3.replace("a" , "o");




//        Question 3: Case-Sensitive Replacement

        String word_5 = "Java programming is fun";
        String word_6 = word_5.replace("Java" , "Python");




//        Question 4: Removing Substrings

        String word_7 = "I love apples";
        String word_8 = word_7.replace("apples" , "");




//        Question 5: Replacing Digits

        String word_9 = "Contact: 123-456-7890";
        String word_10 = word_9.replace("123" , "000");




//        Question 6: Multiple Replacements

        String word_11 = "She sells sea shells by the sea shore";
        String word_12 = word_11.replace("sea" , "ocean");
        String word_13 = word_12.replace("shells" , "stones");




//        Question 7: Conditional Replacement

        String word_14 = "The quick brown fox jumps over the lazy dog";


        if(word_14.contains("fox"))
        {
            String word_15 = word_14.replace("quick" , "slow");
            //System.out.println(word_15);
        }




//        Question 8: Replacing Specific Characters

        String word_16 = "password123";
        String word_17 = word_16.replaceAll("[a-zA-Z0-9]" , "*" );




//        Question 9: Handling Multiple Replacements

        String word_18 = "Java, Java, Java";
        String word_19 = word_18.replace("Java, Java, Java" , "Java, Python, Java");





//        Question 10: Replacing Characters at Specific Positions

        String word_20 = "abcdefghij";
        String word_21 = word_20.replace("abcdefghij" , "axcxexgxix");



        System.out.println(word_21);





    }


}
