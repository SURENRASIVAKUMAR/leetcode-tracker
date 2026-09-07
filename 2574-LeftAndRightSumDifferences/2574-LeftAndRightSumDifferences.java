// Last updated: 9/7/2026, 1:44:05 PM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int ls=0;
            int rs=0;
            for(int j=0;j<i;j++){
                ls+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                rs+=nums[j];
            }
            ans[i]=Math.abs(ls-rs);
        }
        return ans;
    }
}