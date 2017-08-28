/*

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int j=0;
        int runningSum=max;
        for(int i=1;i<nums.length;i++){
            while(j<i && runningSum<=0 ){
                runningSum-=nums[j];
                j++;
            }
            
            runningSum+=nums[i];
            
            if(max<runningSum){
                max=runningSum;
            }
        }
        return max;
    }
}
