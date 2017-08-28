/*

 Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 
*/

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[') { 
                st.push(c); 
            }else if(c==')' || c=='}' || c==']'){
                if(st.isEmpty()) return false;
                if(st.pop()!=openingBracket(c)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static char openingBracket(char c){
        if(c==')') return '(';
        else if(c=='}') return '{';
        else if(c==']') return '[';
        return ' ';
    }
}