package Java_References.String_Methods;

public class compare_To
{
    public static void main(String[] args)
    {

        String myStr1 = "Hello";
        String myStr2 = "Hello";

        // Returns 0 because they are equal
        System.out.println(myStr1.compareTo(myStr2));


        // Positive value: If the string is lexicographically greater than anotherString.
        // Negative value: If the string is lexicographically smaller than anotherString.
        // Zero: If both strings are equal.

        // If the end of the shorter string is reached and all characters are the same,
        // it compares the lengths of the two strings.

        // The comparison is case-sensitive (e.g., "Apple" is not the same as "apple").
        // It uses the Unicode value of each character for comparison.
        // If the strings are of different lengths, the method compares up to the shorter
        // string's length. If all characters match, the longer string is considered greater.

        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";
        String str4 = "apple";
        String str5 = "Apples";

        // Comparing str1 with str2
        // 'A' in "Apple" (Unicode value: 65)
        // 'B' in "Banana" (Unicode value: 66)
        //  Difference: 65 - 66 = -1

        System.out.println(str1.compareTo(str2)); // Output: -1 Negative (str1 < str2)



        // Comparing str1 with str3
        // For "Apple" and "Apple":
        // Compare 'A' in str1 (Unicode 65) with 'A' in str2 (Unicode 65): 65 - 65 = 0.
        // Compare 'p' (Unicode 112) with 'p': 112 - 112 = 0.
        // Compare 'p' (Unicode 112) with 'p': 112 - 112 = 0.
        // Compare 'l' (Unicode 108) with 'l': 108 - 108 = 0.
        // Compare 'e' (Unicode 101) with 'e': 101 - 101 = 0.

        System.out.println(str1.compareTo(str3)); // Output: 0 (str1 == str3)



        // Comparing str1 with str4
        // Unicode of 'A': 65
        // Unicode of 'a': 97
        // The difference: 65 - 97 = -32

        System.out.println(str1.compareTo(str4)); // Output: -32 Negative (case-sensitive)



        // Internal Comparison Example
        // For str1 = "Apple" and str2 = "Apples", the comparison:
        // Compares 'A' to 'A', 'p' to 'p', etc., until 'e' to 'e'.
        // Since all characters match but str2 has an extra 's',
        // the method returns str1.length - str2.length, which is -1.

        System.out.println(str1.compareTo(str5)); // Output: -1 Negative (case-sensitive)


        String f1 = "apple"; // First string
        String f2 = "Apple"; // Second string

        // Compare "apple" with "Apple" using compareTo()
        int result = f1.compareTo(f2);

        //Character-by-character comparison:

        // Compare 'a' and 'A':
        // 'a' has a Unicode value of 97, and 'A' has a Unicode value of 65.
        // Since 97 > 65, "apple" is lexicographically greater than "Apple".
        // Result:

        // Since the first character 'a' is greater than 'A',
        // compareTo() will return a positive value.
        // The actual value returned is based on the difference
        // between the Unicode values of 'a' and 'A', which is 97 - 65 = 32.

        // Print the result of the comparison
        System.out.println("Comparison result: " + result);  // Output: Positive value



    }


}
