package Java_References.Map_Methods;

import java.util.HashMap;


public class put
{
    public static void main(String[] args)
    {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);


        HashMap<String, String> moreCities = new HashMap<String, String>();
        moreCities.put("Canada", "Ottawa");
        moreCities.put("Japan", "Tokyo");

        capitalCities.putAll(moreCities);
        System.out.println(capitalCities);


        // Add new entries only if they don't exist
        capitalCities.putIfAbsent("Canada", "Ottawa");
        capitalCities.putIfAbsent("England", "Cambridge");
        capitalCities.putIfAbsent("Afghanistan", "Kabul");

        System.out.println(capitalCities);

    }

}
