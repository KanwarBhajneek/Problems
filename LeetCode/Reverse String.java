/*
 
 Write a function that takes a string as input and returns the string reversed.
 
 Example:
 Given s = "hello", return "olleh".
 
*/
public class Solution {
    public String reverseString(String s) {
        char[] chars=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
