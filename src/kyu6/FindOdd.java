/* Given an array, find the integer that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */

package kyu6;

public class FindOdd {
    public static int findIt(int[] a) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return a[i];
            }
        }
        return 0;
    }
}

/*
//second solution

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
  public static int findIt(int[] a) {
    Map<Integer, Integer> counts = new HashMap<>(a.length);
    for(int i : a) {
      if(!counts.containsKey(i)) counts.put(i, 1);
      else counts.put(i, counts.get(i) + 1);
    }
    for(Map.Entry<Integer, Integer> entry : counts.entrySet())
        if(entry.getValue() % 2 == 1)
            return entry.getKey();
    return 0;
  }
}
 */


