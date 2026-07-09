// Last updated: 7/9/2026, 9:48:26 AM
class Solution {
    public int maximumScore(int[] nums, int k) {
        int left = k;
        int right = k;
        int min = nums[k];
        int maxScore = min;
        while (left > 0 || right < nums.length - 1) {
            if (left == 0) {
                right++;
            } else if (right == nums.length - 1) {
                left--;
            } else if (nums[left - 1] > nums[right + 1]) {
                left--;
            } else {
                right++;
            }
            min = Math.min(min, Math.min(nums[left], nums[right]));

            maxScore = Math.max(maxScore, min * (right - left + 1));
        }
        return maxScore;
    }
}