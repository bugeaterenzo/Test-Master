package Java_References.Map_Methods;

import java.util.HashMap;

public class merge
{
    public static void main(String[] args)
    {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        // V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)

        // key: The key for which the merging is to be done.
        // value: The new value to merge.
        // remappingFunction: A BiFunction that determines how to merge
        // the existing value (if present) with the new value.

        capitalCities.merge("Canada", "Ottawa", (a, b) -> a + " -> " + b);
        capitalCities.merge("England", "London", (a, b) -> a + " -> " + b);

        capitalCities.merge("Germany", "Berlin", (a, b) -> " -> " + b);

        System.out.println(capitalCities);


    }
}
