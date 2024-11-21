package Java_References.String_Methods;

public class hash_Code
{
    public static void main(String[] args)
    {


        String myStr = "Hello";

        System.out.println(myStr.hashCode());

        // The hashCode() method in Java is used to compute a hash code for an object.
        // The hash code is a unique integer representation of the object, which is
        // particularly useful when working with hash-based collections like
        // HashMap, HashSet, and Hashtable.
        // Here's a detailed explanation of its purpose and use cases:

        //1. Optimizing Search Operations in Collections

        // Hash-based collections (such as HashMap, HashSet, and Hashtable)
        // use the hash code of an object to quickly locate or store objects.
        // These collections use the hash code to determine which bucket to
        // store the object in. By using the hash code, the collections can
        // provide fast lookups, inserts, and deletions.

        // For example, in a HashMap, the key-value pairs are stored based
        // on the hash code of the key. This allows for faster access to
        // values since the object is directly placed into the correct bucket.

        // Example: If you store a key-value pair where the key is "Hello" and
        // the value is 100 in a HashMap, the hash code for the key "Hello" is
        // used to determine the bucket in which the pair will be stored.
        // When searching for the value associated with "Hello", the hashCode()
        // of "Hello" helps quickly locate the bucket, reducing the time
        // complexity to O(1) on average.


    }
}
