/* Given a string, capitalize the letters that occupy even indexes and odd indexes
separately, and return as shown below. Index 0 will be considered even.
For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces.
 */
class AlternateCapitalization {
    public static String[] capitalize(String s){
        String word1 ="";
        String word2 ="";
        for(int  i = 0; i < s.length(); i++)
        {
            char ch = Character.toUpperCase(s.charAt(i));
            if(i % 2 == 0)	{
                word1 = word1 + ch;
                word2 = word2 + s.charAt(i);
            } else {
                word2 = word2 + ch;
                word1 = word1 + s.charAt(i);
            }
        }
        return new String[]{word1, word2};
    }
}