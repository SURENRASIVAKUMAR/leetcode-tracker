// Last updated: 9/2/2026, 11:39:46 AM
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