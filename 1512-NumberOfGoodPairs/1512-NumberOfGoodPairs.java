// Last updated: 9/7/2026, 1:46:19 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}