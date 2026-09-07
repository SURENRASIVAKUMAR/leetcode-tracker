// Last updated: 9/7/2026, 1:43:02 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans[index++] = nums[i];
                    break;
                }
            }
        }
        return ans;
    }
}