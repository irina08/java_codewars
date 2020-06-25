/* Given two arrays of strings a1 and a2 return a sorted array r in
lexicographical order of the strings of a1 which are substrings of strings of a2.

#Example 1: a1 = ["arp", "live", "strong"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns ["arp", "live", "strong"]

#Example 2: a1 = ["tarp", "mice", "bull"]
a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
returns []
 */

package kyu6;

import java.util.*;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j].contains(array1[i]) && !result.contains(array1[i])){
                    result.add(array1[i]);
                }
            }
        }
        result.sort(null);
        return result.toArray(new String[result.size()]);
    }
}


//second solution
/*
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class WhichAreIn {
  public static String[] inArray(String[] array1, String[] array2) {
     Set<String> result = new HashSet<>();

     for(String a1 : array1) {
       for(String a2 : array2) {
         if(a2.contains(a1)) {
           result.add(a1);
           break;
         }
       }
     }
     String[] resultArray = result.toArray(new String[result.size()]);
     Arrays.sort(resultArray);
     return resultArray;
  }
}
 */

//solutions with stream
/*
import java.util.Arrays;

public class WhichAreIn {
  public static String[] inArray(String[] array1, String[] array2) {
    return Arrays.stream(array1)
      .filter(str ->
        Arrays.stream(array2).anyMatch(s -> s.contains(str)))
      .distinct()
      .sorted()
      .toArray(String[]::new);
  }
}
 */
