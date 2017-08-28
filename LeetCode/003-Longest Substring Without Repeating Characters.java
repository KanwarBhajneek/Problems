/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,j=0,i=0;
        HashSet<Character> h = new HashSet<Character>();
        char [] c =s.toCharArray();
        while(i<c.length){
            if(h.add(c[i])){
                i++;
                if(h.size()>max){
                    max=h.size();
                }
            }else{
                h.remove(c[j++]);
            }
        }
        return max;
    }
}