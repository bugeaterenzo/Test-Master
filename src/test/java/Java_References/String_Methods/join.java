package Java_References.String_Methods;

public class join
{
    public static void main(String[] args)
    {


        String fruits = String.join(" ", "Orange", "Apple", "Mango");
        String fruit = String.join(",", "Orange", "Apple", "Mango");

        // 1. String.join() Method:
        // The String.join() method is introduced in Java 8 and is used to join multiple
        // strings with a specified delimiter. It is most commonly used when you need to
        // concatenate multiple strings and add a delimiter (separator) between them.

        System.out.println(fruits);
        System.out.println(fruit);


        // String.concat() Method:
        // The String.concat() method is a method of the String class that concatenates
        // two strings directly without any separator. It only combines the two strings
        // you specify, and you need to call it repeatedly if you want to join more than
        // two strings.





    }


}
