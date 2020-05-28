package kyu6;
/*
Jamie is a programmer, and James' girlfriend. She likes diamonds, and
wants a diamond string from James. Since James doesn't know how to make
this happen, he needs your help.

Task
You need to return a string that looks like a diamond shape when printed
on the screen, using asterisk (*) characters. Trailing spaces should be
removed, and every line must be terminated with a newline character (\n).
Return null/nil/None/... if the input is an even number or negative, as it is
not possible to print a diamond of even or negative size.

Examples
A size 3 diamond:
 *
***
 *
...which would appear as a string of " *\n***\n *\n"

A size 5 diamond:
  *
 ***
*****
 ***
  *
...that is: " *\n ***\n*****\n ***\n *\n"
 */

public class Diamond {
    public static String print(int n) {
        if ((n % 2) == 0 || n <= 0) return null;
        StringBuilder diamond = new StringBuilder();
        for (int i = 1; i < n; i += 2) {
            for (int j = 0; j < (n - i) / 2; j++)
                diamond.append(" ");
            for (int k = 0; k < i; k++)
                diamond.append("*");
            diamond.append("\n");
        }
        for (int i = n; i > 0; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++)
                diamond.append(" ");
            for (int k = 0; k < i; k++)
                diamond.append("*");
            diamond.append("\n");
        }
        return diamond.toString();
    }
}
