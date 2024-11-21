package String_Manipulation;
import java.util.*;

public class Custome_Parse_Method_4_Scanner
{
    private static final Map<String, Integer> wordsToNumbers = new HashMap<>();
    static {
        wordsToNumbers.put("zero", 0);
        wordsToNumbers.put("one", 1);
        wordsToNumbers.put("two", 2);
        wordsToNumbers.put("three", 3);
        wordsToNumbers.put("four", 4);
        wordsToNumbers.put("five", 5);
        wordsToNumbers.put("six", 6);
        wordsToNumbers.put("seven", 7);
        wordsToNumbers.put("eight", 8);
        wordsToNumbers.put("nine", 9);
        wordsToNumbers.put("ten", 10);
        wordsToNumbers.put("eleven", 11);
        wordsToNumbers.put("twelve", 12);
        wordsToNumbers.put("thirteen", 13);
        wordsToNumbers.put("fourteen", 14);
        wordsToNumbers.put("fifteen", 15);
        wordsToNumbers.put("sixteen", 16);
        wordsToNumbers.put("seventeen", 17);
        wordsToNumbers.put("eighteen", 18);
        wordsToNumbers.put("nineteen", 19);
        wordsToNumbers.put("twenty", 20);
        wordsToNumbers.put("thirty", 30);
        wordsToNumbers.put("forty", 40);
        wordsToNumbers.put("fifty", 50);
        wordsToNumbers.put("sixty", 60);
        wordsToNumbers.put("seventy", 70);
        wordsToNumbers.put("eighty", 80);
        wordsToNumbers.put("ninety", 90);
    }

    public static int parseWords(String input) {
        String[] parts = input.split("[ -]");
        int total = 0;
        for (String part : parts) {
            total += wordsToNumbers.getOrDefault(part.toLowerCase(), 0);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner("twenty one");
        String input = scanner.nextLine();
        System.out.println(parseWords(input)); // Outputs: 21
    }
}
