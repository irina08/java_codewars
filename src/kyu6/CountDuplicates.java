/*
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */

package kyu6;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        StringBuilder sb = new StringBuilder();
        String lowerCase = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = lowerCase.charAt(i);
            for (int j = 0; j < text.length(); j++) {
                if (j != i && lowerCase.charAt(j) == c && (sb.toString().indexOf(lowerCase.charAt(j))) < 0){
                    sb.append(lowerCase.charAt(j));
                }
            }
        }
        return sb.length();
    }
}

//SecondWay
/*
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int ans = 0;
    text = text.toLowerCase();
    while (text.length() > 0) {
      String firstLetter = text.substring(0,1);
      text = text.substring(1);
      if (text.contains(firstLetter)) ans ++;
      text = text.replace(firstLetter, "");
    }
    return ans;
  }
}
 */