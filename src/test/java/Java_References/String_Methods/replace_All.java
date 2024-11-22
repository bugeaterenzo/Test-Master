package Java_References.String_Methods;

public class replace_All
{
    public static void main(String[] args)
    {

        String myStr = "I love cats. Cats are very easy to put in my love category. Cats are very popular.";
        String regex = "(?i)cat";


        System.out.println(myStr.replaceAll(regex, "dog"));


        // The replaceAll() method replaces the first match of a regular
        // expression in a string with a new substring.

        // Regex Pattern (regex): "(?i)cat"

        // cat is the word you want to find and replace.
        // The (?i) at the start makes the pattern case-insensitive, so it matches:
        // cat, Cat, cAt, CAT, etc.
        // It matches "cat" as a substring of a larger word like "cats."

        // replaceAll Method:
        // replaceAll searches for all matches of the regex in myStr.
        // Each match of the pattern is replaced with the string "dog".

        // Replacements:
        // The regex finds all case-insensitive occurrences of "cat":
        // In "cats", it matches the substring "cat".
        // In "Cats", it matches "Cat".
        // It does not replace parts of words where "cat" is not a
        // substring (e.g., "category" would not be replaced).

        // Replacements:
        // "cats" -> "dogs"
        // "Cats" -> "Dogs"

        // ________________________________________________________________ //


        String myStr1 = "This is W3Schools";
        String regex1 = "is";


        System.out.println(myStr1.replaceFirst(regex1, "at"));




    }



}
