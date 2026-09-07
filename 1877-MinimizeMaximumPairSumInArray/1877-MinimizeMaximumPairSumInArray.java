// Last updated: 9/7/2026, 1:45:37 PM
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int ans=0;
        while(l<r){
           ans = Math.max(ans, nums[l] + nums[r]);
            l++;
            r--;
            
        }
        return ans;
    }
}


// 2 3 4 4 5 6 