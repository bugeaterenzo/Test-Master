package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.LinkedList;

public class replaceAll
{
    public static void main(String[] args)
    {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "Cambridge");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        capitalCities.replace("England", "London");
        capitalCities.replace("Canada", "Ottawa");
        capitalCities.replace("USA", "New York", "Washington DC");

        System.out.println(capitalCities);


        capitalCities.replaceAll((k, v) -> "The capital of " + k + " is " + v);


//      replaceAll uses a BiFunction (lambda function (k, v) -> "The capital of " + k + " is " + v)
//      which takes two arguments: the key (k) and the value (v).
//      For each entry in the map, it applies the transformation to modify the value while keeping
//      the key unchanged.

        System.out.println(capitalCities);
    }

}
