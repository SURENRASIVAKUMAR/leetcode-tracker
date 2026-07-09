// Last updated: 7/9/2026, 9:48:51 AM
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