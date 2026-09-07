// Last updated: 9/7/2026, 1:41:01 PM
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int d=nums[i]%10;
                nums[i]=nums[i]/10;
                if(d==digit){
                    ans++;
                }
            }
        }
        return ans;
    }
}