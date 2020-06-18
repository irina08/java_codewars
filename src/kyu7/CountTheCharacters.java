/* The goal of this kata is to write a function that takes two inputs:
a string and a character. The function will count the number of times
that character appears in the string. The count is case insensitive.
For example:
countChar("fizzbuzz","z") => 4
countChar("Fancy fifth fly aloof","f") => 5
The character can be any alphanumeric character.
 */

package kyu7;

public class CountTheCharacters {
    public static int charCount(String str, char c) {
        return (int) str.toLowerCase().chars().filter(i -> i == Character.toLowerCase(c)).count();
    }
}

//second solution
/*
public class CC {
  public static int charCount(String str, char c) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.substring(i, i + 1).equalsIgnoreCase("" + c))
        counter++;
    }
    return counter;
  }
}
 */