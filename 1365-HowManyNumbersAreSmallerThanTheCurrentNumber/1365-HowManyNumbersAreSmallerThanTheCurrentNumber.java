// Last updated: 9/7/2026, 1:46:57 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                
                if(nums[i]>nums[j]){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}