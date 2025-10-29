package String;

public class AnagramCheck {

    // Checks if two strings are anagrams (ignores spaces and is case-insensitive)
    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];
        for (char c : s1.toCharArray()) {
            if (c >= 'a' && c <= 'z') freq[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            if (c >= 'a' && c <= 'z') freq[c - 'a']--;
        }
        for (int f : freq) if (f != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        String[][] tests = {
            {"listen", "silent"},
            {"Conversation", "Voices rant on"},
            {"Hello", "Olelh"},
            {"Dormitory", "Dirty room"},
            {"abc", "ab"}
        };
        for (String[] pair : tests) {
            System.out.println(pair[0] + " , " + pair[1] + " -> " + isAnagram(pair[0], pair[1]));
        }
    }
}
