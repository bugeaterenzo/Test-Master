package September_03_Assignments.String_Methods;

public class charAt {


    public static void main (String[] args) {




//        Question 1: Accessing the First Character

          String greetings = "Hello";
          char character_1 = greetings.charAt(0);





//        Question 2: Accessing the Last Character

          String word_1 = "Java";
          char character_2 = word_1.charAt(3);





//        Question 3: Accessing a Character by Index

          String word_2 = "Programming";
          char character_3 = word_2.charAt(3);





//        Question 4: Handling Strings with Special Characters

          String word_3 = "@OpenAI!";
          char character_4 = word_3.charAt(0);
          char character_5 = word_3.charAt(7);





//        Question 5: Accessing a Character in a Specific Position

          String word_4 = "Developers!";
          char character_6 = word_4.charAt(4);





//         Question 6: Finding the Middle Character

           String word_5 = "Coding!";
           char character_7 = word_5.charAt(2);




//         Question 7: Reversing a String Manually

           String word_6 = "Python";


           for( int i = 5 ;  i >= 0;   i--)
           {
           char character_8 = word_6.charAt(i);
           }


//         Question 8: Counting Specific Characters

           String word_7 = "Mississippi";

           int count_s = 0;

           for( int i = 0 ;  i < word_7.length();   i++)
           {
           char character_8 = word_7.charAt(i);
           if(character_8 == 's') count_s++;
           }





//         Question 9: Extracting Initials from a Name

           String word_8 = "John Doe";
           char character_9 = word_8.charAt(0);
           char character_10 = word_8.charAt(5);







//         Question 10: Checking for Vowels at Specific Positions

           String word_9 = "Umbrella";
           char character_11 = word_9.toLowerCase().charAt(0);
           char character_12 = word_9.toLowerCase().charAt(7);

           char[] check_char = {character_11,character_12};

           for( int i = 0; i < check_char.length ; i++)
           {
               char c = check_char[i];
               switch ( c )
               {
                   case 'a' :
                       System.out.println(c + " true");
                       break;
                   case 'e' :
                       System.out.println(c + " true");
                       break;
                   case 'i' :
                       System.out.println(c + " true");
                       break;
                   case 'o' :
                       System.out.println(c + " true");
                       break;
                   case 'u' :
                       System.out.println(c + " true");
                       break;
                   default:
                       System.out.println("false");
               }
           }






//        System.out.println(character_9 + "." + character_10);






    }


}
