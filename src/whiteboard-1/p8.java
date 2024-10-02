import java.util.HashMap;

public class p8 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (isAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        s2 = s2.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) {
                return false;
            }
            countMap.put(c, countMap.get(c) - 1);
        }
        return true;
    }
}
