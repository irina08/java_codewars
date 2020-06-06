/* Assume "#" is like a backspace in string. This means that string
"a#bc#d" actually is "bd"
Your task is to process a string with "#" symbols.
Examples
"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
 */

public class BackspacesInString {
    public String cleanString(String s) {
        while (s.matches(".*#.*")) s = s.replaceFirst(".?#", "");
        return s;
    }
}

//Second solution
/* public class BackspacesInString {
    public String cleanString(String s) {
        String data = "";
        for (int i =0;i < s.length();i++){
            if(s.charAt(i) != '#')
                data += s.charAt(i);
            else if(data.length() > 0)
                data= data.substring(0, data.length()-1);
        }
        return data;
    }
}
 */