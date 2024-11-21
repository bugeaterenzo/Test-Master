package Java_References.Errors_and_Exceptions;

import java.util.LinkedHashMap;
import java.util.Map;


public class errors_and_exceptions
{
    public static void main(String[] args)
    {

        // Create a LinkedHashMap to store exceptions and their descriptions

        Map<String, String> exceptionMap = new LinkedHashMap<>();

        // Adding key-value pairs to the map
        exceptionMap.put("ArithmeticError", "Occurs when a numeric calculation goes wrong");
        exceptionMap.put("ArrayIndexOutOfBoundsException", "Occurs when trying to access an index number that does not exist in an array");
        exceptionMap.put("ClassFormatError", "Occurs when a class file cannot be accessed");
        exceptionMap.put("ClassNotFoundException", "Occurs when trying to access a class that does not exist");
        exceptionMap.put("ConcurrentModificationException", "Occurs when an element is added or removed from iterables");
        exceptionMap.put("FileNotFoundException", "Occurs when a file cannot be accessed");
        exceptionMap.put("IncompatibleClassChangeError", "Occurs when there's been a change in a base class after a child class has already been initialized");
        exceptionMap.put("InputMismatchException", "Occurs when entering wrong input (e.g. text in a numerical input)");
        exceptionMap.put("InterruptedException", "Occurs when a Thread is interrupted while waiting/sleeping");
        exceptionMap.put("InvalidClassException", "Occurs when the Serialization runtime observes a problem with a class");
        exceptionMap.put("IOException", "Occurs when an input or output operation fails");
        exceptionMap.put("NegativeArraySizeException", "Occurs when trying to create an array with negative size");
        exceptionMap.put("NoClassDefFoundError", "Occurs when the class is not found at runtime");
        exceptionMap.put("NoSuchFieldException", "Occurs when trying to access a class field/variable that does not exist");
        exceptionMap.put("NoSuchMethodException", "Occurs when trying to access a class method that does not exist");
        exceptionMap.put("NullPointerException", "Occurs when trying to access an object reference that is null");
        exceptionMap.put("NumberFormatException", "Occurs when it is not possible to convert a specified string to a numeric type");
        exceptionMap.put("RuntimeException", "Occurs when an exception occurs at runtime");
        exceptionMap.put("StringIndexOutOfBoundsException", "Occurs when trying to access a character in a String that does not exist");
        exceptionMap.put("TypeNotPresentException", "Occurs when a type cannot be found");
        exceptionMap.put("IllegalArgumentException", "Occurs when an illegal argument is passed to a method");
        exceptionMap.put("IllegalStateException", "Occurs when a method is called at an illegal time");



        // Print the map with equal spacing between key-value pairs

        for (Map.Entry<String, String> entry : exceptionMap.entrySet())
        {
            String key = entry.getKey();
            String value = entry.getValue();

            // Print key and value with equal spaces
            System.out.printf("%-35s : %-100s%n", key, value);

        }


    }


}
