// Last updated: 7/9/2026, 9:47:05 AM
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