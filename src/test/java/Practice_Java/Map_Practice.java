package Practice_Java;

import java.util.*;

public class Map_Practice {

    public static void main (String[] args)
    {


        Map<Integer , String> employee_1 = new HashMap<>(); // order not guaranteed

        Map<Integer , String> employee_2 = new LinkedHashMap<>(); // insertion order is guaranteed

        Map<Integer , String> employee_3 = new TreeMap<>(); // sorted order is applied no null key is accepted


//        add key value pairs

        employee_1.put( 1, "John" );
        employee_1.put( 2, "Simon" );
        employee_1.put( 3, "Simon" );
        employee_1.put( null, "Simon" );
        employee_1.put( 4, null );
        employee_1.put( null, "joey" );
        employee_1.put( 5, null );

        employee_2.put( 1, "Abraham" );
        employee_2.put( 2, "Alvin" );
        employee_2.put( 3, "Alvin" );
        employee_2.put( null, "alija" );
        employee_2.put( 4, null );
        employee_2.put( null, "chandler" );
        employee_2.put( 5, null );

        employee_3.put( 1, "Gabriel");
        employee_3.put( 2, "Katya");
        employee_3.put( 3, "Katya");
        // employee_3.put( null, "peter" ); not allowed null id
        employee_3.put( 4, null);
        employee_3.put( 5, null);



//        remove values

        employee_1.remove( 1, "John" ); // it is case-sensitive so remove( 1, "john" ) will not work!

        employee_2.remove( 1, "Abraham" );

        employee_3.remove( 1, "Gabriel");

        employee_1.remove(2 );

        employee_2.remove(2 );

        employee_3.remove(2);




//        print values

       String value_1 =  employee_1.get(1);
       String value_2 =  employee_2.get(1);
       String value_3 =  employee_3.get(1);



//       print key value pairs

        Set<Map.Entry<Integer,String>> pair_1 =  employee_1.entrySet();  // Hashmap
        Set<Map.Entry<Integer,String>> pair_2 =  employee_2.entrySet();  // LinkedHashmap
        Set<Map.Entry<Integer,String>> pair_3 =  employee_3.entrySet();  // TreeMap



//       print keys

        Set<Integer> keys_1 = employee_1.keySet();  // Hashmap
        Set<Integer> keys_2 = employee_2.keySet();  // LinkedHashmap
        Set<Integer> keys_3 = employee_3.keySet();  // TreeMap




//       print values

        Collection<String> values_1 = employee_1.values();  // Hashmap
        Collection<String> values_2 = employee_2.values();  // LinkedHashmap
        Collection<String> values_3 = employee_3.values();  // TreeMap



//        get size

        int size_1 = employee_1.size();
        int size_2 = employee_2.size();
        int size_3 = employee_3.size();



//        Clear the whole Map

        employee_1.clear();
        employee_2.clear();
        employee_3.clear();



        System.out.println(employee_1);
        System.out.println(employee_2);
        System.out.println(employee_3);





    }
}
