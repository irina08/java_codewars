package kyu7;

/* Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/
import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        String shortestword = words[0];
        for (int i = 1; i < words.length; i++) {
            if (shortestword.length() > words[i].length()) {
                shortestword = words[i];

            }
        }
        return shortestword.length();
    }
}
