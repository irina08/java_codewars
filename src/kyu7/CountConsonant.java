/* Write a function consonantCount, consonant_count or ConsonantCount that takes
a string of English-language text and returns the number of consonants in the string.
Consonants are all letters used to write English excluding the vowels a, e, i, o, u.
 */
package kyu7;

public class Consonants {
    public static int getCount(String str) {
        return str.replaceAll("[^A-Za-z]|[AEIOUaeiou]", "").length();
    }
}

