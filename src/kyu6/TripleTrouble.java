/* Write a function
TripleDouble(long num1, long num2)
which takes numbers num1 and num2 and returns 1 if there is a straight
triple of a number at any place in num1 and also a straight double of
the same number in num2.

If this isn't the case, return 0
Examples
TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and
                                          // num2 has straight double 99s
TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
TripleDouble(12345, 12345) == 0
TripleDouble(666789, 12345667) == 1
 */

package kyu6;

public class TripleTrouble
{
    public static int TripleDouble(long num1, long num2)
    {
        String n1str = String.valueOf(num1);
        String n2str = String.valueOf(num2);
        for(int i = 0;i < 10; i++) {
            String n = String.valueOf(i);
            if (n1str.contains(n+n+n) && n2str.contains(n+n))
                return 1;
        }
        return 0;
    }
}

//Second way
/*
    public static int TripleDouble(long num1, long num2)
  {
    String s = String.valueOf(num1) + " " + String.valueOf(num2);
    return (s.matches(".*(\\d){3}.*\\s.*\\1{2}.*") ? 1 : 0);
  }
 */
