/*

 Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 
 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 
 
*/
public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        char a[]=s.toCharArray();
        String c="";
        for(char n:a){
            if(n==' '){
                sb.append(c+" ");
                c="";
            }else{
                c=n+c;
            }
        }
        sb.append(c);
        return sb.toString();
    }
}
