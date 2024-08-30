import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Sports_ranking {



    public static void main (String[] args) {

        var input = new Scanner(System.in);

        String[] Top_Teams = new String[5];

        System.out.println("Rank your top 5 teams in order from best to worst..!");

        for( int i =0; i < Top_Teams.length; i++){

            System.out.print("Team number " + (i+1) + " ");
            String user_input = input.next().toUpperCase();
            Top_Teams[i] = user_input;

        }

        System.out.println("The Top Ranking team from the list above is : " + Top_Teams[0]);
        System.out.println(Arrays.toString(Top_Teams));





    }




}
