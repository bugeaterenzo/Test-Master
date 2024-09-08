package September_03_Assignments.String_Methods;

public class contains {

    public static void main (String[] args) {


//         Question 1: Basic Usage of contains()

           String greetings =  "Hello, World!";
           boolean contain_1 = greetings.contains("World");



//         Question 2: Case Sensitivity Check

           String word_1 =  "Java Programming";
           boolean contain_2 = word_1.contains("java");




//         Question 3: Checking for a Character


           String word_2 =  "OpenAI";
           boolean contain_3 = word_2.contains("A");




//        Question 4: Checking for a Sequence of Characters

          String word_3 =  "Learning Java is fun";
          boolean contain_4 = word_3.contains("Java is");





//        Question 5: Checking for a Space


          String word_4 =  "NoSpacesHere";
          boolean contain_5 = word_4.contains(" ");





//        Question 6: Conditional Substring Check


          String word_5 =  "Data Science and AI";

          boolean contain_6 = word_5.contains("Science");
          if(contain_6)
          {
              System.out.println("");
          }
          else
          {
              word_5 = word_5.replaceAll("Science" , "Analysis");
          }






//        Question 7: Multiple Substring Check


          String word_6 =  "Machine Learning with Python";
          boolean contain_7 = word_6.contains("Machine");
          boolean contain_8 = word_6.contains("Python");

          boolean result_1 = (contain_7 && contain_8) ? true : false ;



//        Question 8: Checking for a Substring in User Input


          String word_7 =  "I love programming in Java";
          boolean contain_9 = word_7.contains("Java");

          if(contain_9 == true) System.out.println("User is interested in Java");
          else System.out.println("User is interested in something else");





//        Question 9: Dynamic Substring Search

          String word_8 =  "The quick brown fox jumps over the lazy dog";
          boolean contain_10 = word_8.contains("fox");





//        Question 10: Case-Insensitive Substring Check


          String word_9 =  "Data Mining Techniques";
          boolean contain_11 = word_9.contains("data");

          String result_2 = (contain_11 == true) ? "Match found" : " No Match found" ;







          System.out.println(result_2);











    }
}
