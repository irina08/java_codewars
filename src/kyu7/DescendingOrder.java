/* Your task is to make a function that can take any non-negative integer as a
argument and return it with its digits in descending order. Essentially, rearrange
the digits to create the highest possible number.
Examples:
Input: 21445 Output: 54421
Input: 145263 Output: 654321
Input: 123456789 Output: 987654321
 */

package kyu7;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] tempArray = String.valueOf(num).toCharArray();
        Arrays.sort(tempArray);
        return Integer.parseInt(new StringBuilder(new String(tempArray)).reverse().toString());
    }
}

/*
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}
 */

/*
import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String[] numbers = (Integer.toString(Integer.valueOf(num))).split("");
    Arrays.sort(numbers);
    String result = "";
    for(String s : numbers) {
      result = s + result;
    }
    return Integer.parseInt(result);
  }
}
 */