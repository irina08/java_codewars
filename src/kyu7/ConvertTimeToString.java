/* Given time in seconds, return formatted string, as shown in following example:
####Example: Input: 90061 sec
Output: 1 1 1 1
90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds)
93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)
####Useful conversions:
60 sec = 1 min
60 min = 1 hour
24 hour = 1 day
 */

package kyu7;

class ConvertTimeToString {
    public static String convertTime(int timeDiff) {
        return timeDiff / 86400 + " " + timeDiff % 86400 / 3600 + " " + timeDiff % 3600 / 60 + " " + timeDiff % 60;
    }
}

