package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.Map;

public class remove
{
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        capitalCities.remove("USA");
        capitalCities.remove("Germany", "Berlin");
        capitalCities.remove("England", "Cambridge");


        String targetValue = "London";

        // Removing entries with the specified value (Java 8+)
        capitalCities.values().removeIf(value -> value.equals(targetValue));

        System.out.println("Updated Map after removing value " + targetValue + ": " + capitalCities);

        System.out.println(capitalCities);
    }


}
