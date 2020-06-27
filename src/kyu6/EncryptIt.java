/* You want to create secret messages which can be deciphered by the Decipher
this! kata. Here are the conditions:
Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter needs to be converted to its ASCII code.
The second letter needs to be switched with the last letter
Keepin' it simple: There are no special characters in input.
Examples:
Kata.encryptThis("Hello") => "72olle"
Kata.encryptThis("good") => "103doo"
Kata.encryptThis("hello world") => "104olle 119drlo"
 */

package kyu6;

public class EncryptIt {
    public static String encryptThis(String text)  {
        if (text.length() == 0) return "";
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append((int) word.charAt(0));
            if (word.length() > 1) {
                result.append(word.charAt(word.length() - 1));
                if (word.length() == 3) {
                    result.append(word.charAt(1));
                }
                if (word.length() > 3) {
                    result.append(word, 2, word.length() - 1).append(word.charAt(1));
                }
            }
            result.append(" ");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }
}

