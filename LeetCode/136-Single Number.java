/*

 Given an array of integers, every element appears twice except for one. Find that single one.
 
*/

public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(nums[i])){
                hmap.remove(nums[i]);
            }else{
                hmap.put(nums[i],1);
            }
        }
        return new ArrayList<Integer>(hmap.keySet()).get(0);
    }
}
