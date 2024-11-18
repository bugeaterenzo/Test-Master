package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.LinkedList;

public class remove
{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        capitalCities.remove("USA");
        capitalCities.remove("Germany", "Berlin");
        capitalCities.remove("England", "Cambridge");

        System.out.println(capitalCities);
    }


}
