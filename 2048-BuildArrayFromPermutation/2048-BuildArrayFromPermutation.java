// Last updated: 7/9/2026, 9:48:23 AM
class Solution {
    public int[] buildArray(int[] nums) {
        
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}