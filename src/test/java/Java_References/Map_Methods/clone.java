package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.LinkedList;

public class clone
{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        HashMap copy = (HashMap)capitalCities.clone();
        copy.remove("England");

        System.out.println(capitalCities);
        System.out.println(copy);


    }


}
