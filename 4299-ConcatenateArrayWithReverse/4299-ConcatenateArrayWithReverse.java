// Last updated: 7/9/2026, 9:46:55 AM
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