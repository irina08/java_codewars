/* Digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n. If that value has more
than one digit, continue reducing in this way until a single-digit
number is produced. This is only applicable to the natural numbers.
Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */

public class DigitalRoot {
    static int digital_root(int n) {
        if (n > 9) {
            int sum = n % 10 + digital_root(n/10);
            if(sum > 9) {
                return digital_root(sum);
            } else {
                return sum;
            }
        } else {
            return n;
        }
    }
}

//second variant
/*
public class DigitalRoot {
  public static int digital_root(int n) {
    while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
  }
}
 */