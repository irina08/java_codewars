package kyu6;

/* Write a method that takes an array of consecutive (increasing) letters as
input and that returns the missing letter in the array.
You will always get an valid array. And it will be always exactly one letter
be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:
['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 */

public class FindTheMissingLetter
{
    public static char findMissingLetter(char[] array)
    {
        for (int i = 1; i < array.length; i++) {
            char prev = array[i - 1];
            char current = array[i];

            if (current - prev != 1) {
                return (char)(prev + 1);
            }
        }
        return 0;
    }
}

//second Solution
/*
public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    String str = "abcdefghijklmnopqrstuvwxyz";
    str = str + str.toUpperCase();
    int index = str.indexOf(array[0]);
    for (int i = 0; i < array.length; i++) {
      if (str.charAt(index + i) != array[i])
          return (char) ((int) array[i] - 1);
    }
    return ' ';
  }
}
 */