package September_03_Assignments.String_Methods;

public class Trim {

    public static void main(String[] args)
    {


//        Question 1: Basic Trimming

        String word_1 = " Hello World ";
        word_1 = word_1.trim();





//        Question 2: Trimming an Already Trimmed String

        String word_2 = "JavaProgramming";
        word_2 = word_2.trim();




//        Question 3: Trimming a String with Only Spaces

        String word_3 = " ";
        word_3 = word_3.trim();
        int word_3_lenght = word_3.length();




//        Question 4: Trimming Special Characters


        String word_4 = "\tJava\n";  // \\tJava\\n 2 backslashes are needed to store a single \ as a String
        word_4 = word_4.trim();



//        Question 5: Trimming User Input

        String word_5 = " User Input ";
        word_5 = word_5.trim();





//        Question 6: Conditional Trimming

        String word_6 = " Welcome to Java ";
        word_6 = word_6.trim();

        boolean startsWithWelcome = word_6.startsWith("Welcome");
        String result_1 = (startsWithWelcome) ? word_6 : "";




//        Question 7: Combining trim() with Length Check

        String word_7 = " OpenAI ";
        word_7 = word_7.trim();

        boolean result_2 = (word_7.length() >= 6) ? true : false;




//        Question 8: Trimming and Replacing

        String word_8 = " Hello World ";
        word_8 = word_8.trim().replaceAll(" " , " ");





//        Question 9: Trimming and Case Conversion

        String word_9 = " java programming ";
        word_9 = word_9.trim().toUpperCase();



//        Question 10: Trimming in a Sentence

        String word_10 = " java programming ";
        word_10 = word_10.trim().replaceAll(" " , " ");



        System.out.println(word_10);




    }

}
