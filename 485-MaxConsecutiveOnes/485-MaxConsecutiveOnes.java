// Last updated: 7/9/2026, 9:49:54 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                m=Math.max(c,m);
            }else{
                c=0;
            }
            
        }
        return m;
    }
}