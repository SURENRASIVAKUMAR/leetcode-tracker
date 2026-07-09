// Last updated: 7/9/2026, 9:52:00 AM
class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        } 
        return min;
    }
}