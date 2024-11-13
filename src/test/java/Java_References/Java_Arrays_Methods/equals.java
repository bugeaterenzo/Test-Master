package Java_References.Java_Arrays_Methods;

import java.util.Arrays;

public class equals
{
    public static void main(String[] args)
    {



        String[] cars = {"Volvo", "BMW", "Tesla"};

        String[] cars2 = {"Volvo", "BMW", "Tesla"};

        String[] cars3 = {"volvo", "bMW"};

        String[][] cars4 = {{"volvo"}, {"bMW"}};


        System.out.println(Arrays.equals(cars, cars2));

        System.out.println(Arrays.equals(cars, cars3));

        System.out.println(Arrays.equals(cars, cars4));




    }




}
