package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.LinkedList;

public class get
{
    public static void main(String[] args)
    {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.get("England"));

        // Output the value of an entry in a map, or "Unknown" if it does not exist:

        System.out.println(capitalCities.getOrDefault("England", "Unknown"));
        System.out.println(capitalCities.getOrDefault("Canada", "Unknown"));




    }


}
