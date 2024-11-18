package Java_References.Map_Methods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Iterators
{
    public static void main(String[] args)
    {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();


        while ( iterator.hasNext() )
        {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        Iterator<String> keyIterator = map.keySet().iterator();

        while ( keyIterator.hasNext() )
        {
            String key = keyIterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }



        Iterator<Integer> valueIterator = map.values().iterator();

        while ( valueIterator.hasNext() )
        {
            Integer value = valueIterator.next();
            System.out.println("Value: " + value);
        }




    }

    }



