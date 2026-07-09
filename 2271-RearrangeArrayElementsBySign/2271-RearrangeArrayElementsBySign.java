// Last updated: 7/9/2026, 9:48:12 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }
        return ans;
    }
}