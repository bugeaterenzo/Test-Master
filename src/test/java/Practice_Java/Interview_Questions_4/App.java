package Practice_Java.Interview_Questions_4;

import java.util.*;

public class App {


    public static void main(String[] args) {

         String[] names = { "Gurbaz" ,"Bob" , " john" , "Gurbaz" , "Gurbaz" , "yousef"};


         String word = "Gurbaz";

        Map<Character,Integer> name_map = new HashMap<>();

        for ( int index = 0; index < word.length(); index++ )
        {
            char character = word.charAt(index);
            if (name_map.containsKey(character))
            {
                name_map.put(character, name_map.get(character) + 1);  //  increment the value by 1 to modify it for each occurrence
            } else
            {
                name_map.put(character, 1 );  // initialize by 1
            }
        }

        System.out.println(name_map);














    }


}
