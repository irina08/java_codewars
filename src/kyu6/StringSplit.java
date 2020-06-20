/* Complete the solution so that it splits the string into pairs
of two characters. If the string contains an odd number of characters
then it should replace the missing second character of the final pair
with an underscore ('_').
Examples:
StringSplit.solution("abc") // should return {"ab", "c_"}
StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
*/

package kyu6;

public class StringSplit {
    public static String[] solution(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }
}