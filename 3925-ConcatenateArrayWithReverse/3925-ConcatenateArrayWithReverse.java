// Last updated: 9/7/2026, 1:40:57 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[n - 1 - i];
        }

        return ans;
    }
}