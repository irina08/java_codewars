/* Complete the method/function so that it converts dash/underscore
delimited words into camel casing. The first word within the output
should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case).
Examples
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
*/

package kyu6;

class StringToCamelCase{

  static String toCamelCase(String s){
    String[] words = s.split("[-_]");
    StringBuilder sb = new StringBuilder(words[0]);
    for (int i = 1; i < words.length; i++)
        sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
    return sb.toString();
  }
}