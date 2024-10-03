import java.util.HashMap;

public class p8 {

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("debit card", "Bad credit")); // true
        System.out.println(areAnagrams("hello", "bye")); // false
        System.out.println(areAnagrams("restful", "fluster")); // true
        System.out.println(areAnagrams("listen", "silentt")); // false
        System.out.println(areAnagrams("Conversation", "Voices, rant on")); // true
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and punctuation, and convert to lowercase
        String cleanedStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (cleanedStr1.length() != cleanedStr2.length()) {
            return false;
        }

        // Count the characters in str1
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : cleanedStr1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Decrease the count based on characters in str2
        for (char c : cleanedStr2.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false; // Character not found or count goes negative
            }
            countMap.put(c, countMap.get(c) - 1);
        }

        return true; // All counts should be zero if they are anagrams
    }
}
