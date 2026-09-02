// Last updated: 9/2/2026, 11:41:36 AM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                s+=nums[j];
                if(s==k){
                    c++;
                }
            }
        }
        return c;
    }
}