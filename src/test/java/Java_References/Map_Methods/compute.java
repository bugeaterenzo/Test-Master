package Java_References.Map_Methods;

import java.util.HashMap;

public class compute
{
    public static void main(String[] args)
    {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        //  Compute a value for a new entry in a map:

        capitalCities.compute("England", (k, v) -> v + "(" + k + ")");

        System.out.println(capitalCities);



        capitalCities.computeIfAbsent("Canada", (k) -> "Toronto (" + k + ")");

        System.out.println(capitalCities);



        capitalCities.computeIfPresent("England", (k, v) -> v + "(" + k + ")");

        System.out.println(capitalCities);


    }
}
