// Write a function to find the longest common prefix string amongst an array of strings.

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length<1) return "";
        if(strs[0].length()<1){ return "";}
        char a= strs[0].charAt(0);
        boolean isEqual=true;
        for(int i=0;i<strs.length;i++){

            if(strs[i].length()<1 || strs[i].charAt(0)!=a){
                isEqual=false;
                break;
            }
            strs[i]=strs[i].substring(1);

        }
        if(isEqual){
            
            return a+longestCommonPrefix(strs);
        }else{
            return "";
        }
    }
}