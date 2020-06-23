/*

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

