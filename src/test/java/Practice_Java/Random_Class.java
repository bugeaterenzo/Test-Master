package Practice_Java;

import java.util.Random;

public class Random_Class {


    public static void main (String[] args) {

        Random random = new Random();
        int randomNumber;

        randomNumber = random.nextInt(( 9 )  + 1);

        System.out.println(randomNumber);

        // random.nextInt((10 - 1) + 1) generates a random integer between
        // 0 and 9 (since nextInt(bound) generates numbers from 0 to bound - 1).
        //Adding 1 to this result shifts the range from [0, 9] to [1, 10],
        // giving a random number between 1 and 10.




    }


}
