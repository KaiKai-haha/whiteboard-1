import java.util.HashMap;
import java.util.Map;

public class p6 {
    public static void main(String[] args) {
        String input = "Hello, world!";
        char maxChar = findMaxOccurrenceCharacter(input);
        int count = maxOccurrenceCount(input, maxChar);
        System.out.println("Character: '" + maxChar + "', Occurrence: " + count);
    }

    // Method to find the character with the maximum occurrence
    public static char findMaxOccurrenceCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {  // Ignore whitespace and punctuation
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        char maxChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }

    // Method to get the occurrence count of a character
    public static int maxOccurrenceCount(String str, char maxChar) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == maxChar) {
                count++;
            }
        }
        return count;
    }
}
