/*

 Reverse digits of an integer.
 
 Example1: x = 123, return 321
 Example2: x = -123, return -321
 
 
*/

public class Solution {
    public int reverse(int x) {
        long o=0;
        while(x!=0){
            o=o*10+x%10;
            x=x/10;
            if(o>Integer.MAX_VALUE || o<Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)o;
    }
}
