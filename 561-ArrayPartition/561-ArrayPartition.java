// Last updated: 7/9/2026, 9:49:45 AM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=0;i<nums.length-1;i+=2){
           s+=nums[i];
        }
        return s;
    }
}