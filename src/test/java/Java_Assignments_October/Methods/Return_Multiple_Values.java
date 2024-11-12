package Java_Assignments_October.Methods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Return_Multiple_Values
{
    public Map<String , Integer> minMax ( int[] numbers )
    {
        Map<String , Integer> result = new LinkedHashMap<>();
        Arrays.sort(numbers);
        result.put("min" , numbers[0]);
        result.put("max" , numbers[numbers.length-1]);
        return result;
    }
}
