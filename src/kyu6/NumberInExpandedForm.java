/* You will be given a number and you will need to return it
as a string in Expanded Form. For example:
NumberInExpandedForm.expandedForm(12); # Should return "10 + 2"
NumberInExpandedForm.expandedForm(42); # Should return "40 + 2"
NumberInExpandedForm
NOTE: All numbers will be whole numbers greater than 0.
 */

public class NumberInExpandedForm
{
    public static String expandedForm(int num)
    {
        StringBuffer sb = new StringBuffer();
        int reminder;
        int digit = 0;
        while (num > 0) {
            reminder = num % 10;
            num = num / 10;
            if (reminder > 0)
                sb = sb.insert(0, reminder * (int)Math.pow(10, digit) + " + ");
            digit++;
        }
        return sb.substring(0, sb.length() - 3);
    }
}