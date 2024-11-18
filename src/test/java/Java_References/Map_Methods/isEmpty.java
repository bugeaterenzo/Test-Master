package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.LinkedList;

public class isEmpty
{
    public static void main(String[] args)
    {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        System.out.println(capitalCities.isEmpty());

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.isEmpty());


    }


}
