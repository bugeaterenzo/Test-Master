package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.LinkedList;

public class contains
{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");


        System.out.println(capitalCities.containsKey("England"));
        System.out.println(capitalCities.containsKey("Canada"));

        System.out.println(capitalCities.containsValue("London"));
        System.out.println(capitalCities.containsValue("Ottawa"));





    }



}
