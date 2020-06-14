/* An anagram is the result of rearranging the letters of a word to produce a
new word (see wikipedia).
Note: anagrams are case insensitive
Complete the function to return true if the two arguments given are anagrams
of each other; return false otherwise.
Examples
        "foefet" is an anagram of "toffee"
        "Buckethead" is an anagram of "DeathCubeK"
*/

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        for (char c : test.toCharArray()) {
            if (!original.toLowerCase().contains("" + Character.toLowerCase(c))) {
                return false;
            }
        }
        return test.length() == original.length();
    }
}