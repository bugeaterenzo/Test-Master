package Practice_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Working_with_maps {

    public static void main (String[] args)
    {


        String paragraph = "Lorem Ipsum is simply dummy Lorem of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever Lorem the 1500s, when an " +
                "unknown Lorem took a galley of type and scrambled it to make a type specimen book. Lorem " +
                "has survived not only five centuries, but Lorem the leap into electronic typesetting, " +
                "Lorem essentially unchanged. It was popularised in the 1960s with the release of " +
                "Elettra sheets containing Lorem Ipsum passages, and more recently with desktop publishing" +
                " software like Aldus PageMaker including versions of Lorem Ipsum.";





        char[] char_paragraph = paragraph.toCharArray();

        ArrayList<String> string_paragraph = new ArrayList<>();

        String word = "";

        Map<String, Integer> paragraph_word_count = new HashMap<>();


        for( int i = 0 ; i < char_paragraph.length; i++)
        {


            if( char_paragraph[i] != ' ')
            {
                word += char_paragraph[i];
            }
            else
                {
                    string_paragraph.add(word.trim());
                    word = "";
                }

        }

        for ( String word_of_paragraph : string_paragraph )
        {
            if(paragraph_word_count.containsKey(word_of_paragraph))
            {
                paragraph_word_count.put( word_of_paragraph , paragraph_word_count.get( word_of_paragraph ) + 1 );
            }
            else
            {
                paragraph_word_count.put( word_of_paragraph , 1 );
            }
        }

        // System.out.print(paragraph_word_count);

         paragraph_word_count.forEach( (k , v ) -> System.out.print( k + " -- " + v + " , "));




    }
}
