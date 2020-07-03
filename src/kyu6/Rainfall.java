/* data and data1 are two strings with rainfall records of a few cities
for months from January to December. The records of towns are separated by \n.
The name of each town is followed by :.
data and towns can be seen in "Your Test Cases:".

Task:
function: mean(town, strng) should return the average of rainfall for the city
town and the strng data or data1 (In R and Julia this function is called avg).
function: variance(town, strng) should return the variance of rainfall for the
city town and the strng data or data1.
Examples:
mean("London", data), 51.19(9999999999996)
variance("London", data), 57.42(833333333374)
Notes:
if functions mean or variance have as parameter town a city which has no records
return -1 or -1.0 (depending on the language)
Don't truncate or round: the tests will pass if abs(your_result - test_result)
<= 1e-2 or abs((your_result - test_result) / test_result) <= 1e-6 depending on the language.
Shell tests only variance
 */

package kyu6;

public class Rainfall {

    public static double mean(String town, String strng) {
        if (!strng.contains(town + ":"))
            return -1;
        double[] val = Rainfall.doubArray(town, strng);
        double sum = 0;
        for (int i = 0; i < val.length; i++) {
            sum += val[i];
        }
        return sum / val.length;
    }

    public static double variance(String town, String strng) {
        if (!strng.contains(town + ":"))
            return -1;
        double[] val = Rainfall.doubArray(town, strng);
        double mean = mean(town, strng);
        double temp = 0;
        for (double a : val) {
            temp += (mean - a) * (mean - a);
        }
        return temp / val.length;
    }

    public static double[] doubArray(String town, String strng) {
        String[] s = strng.split("\n");
        for (int i = 0; i < s.length; i++)
            if (s[i].split(":")[0].equals(town)) {
                String[] nm = s[i].split(":")[1].split(",");
                double[] v = new double[nm.length];
                for (int j = 0; j < nm.length; j++)
                    v[j] = Double.parseDouble(nm[j].split(" ")[1]);
                return v;
            }
        return null;
    }