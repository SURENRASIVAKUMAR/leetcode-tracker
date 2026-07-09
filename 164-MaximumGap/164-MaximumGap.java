// Last updated: 7/9/2026, 9:51:53 AM
class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
           int d=nums[i+1]-nums[i];
            if(d>max){
                max=d;
            }
        }
        return max;
    }
}