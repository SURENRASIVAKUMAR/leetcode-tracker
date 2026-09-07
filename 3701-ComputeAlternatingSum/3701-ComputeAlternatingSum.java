// Last updated: 9/7/2026, 1:41:58 PM
class Solution {
    public int alternatingSum(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                s+=nums[i];
            }else{
                s-=nums[i];
            }
        }
        return s;
    }
}