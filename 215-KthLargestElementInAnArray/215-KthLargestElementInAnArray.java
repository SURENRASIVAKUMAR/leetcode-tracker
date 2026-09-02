// Last updated: 9/2/2026, 11:44:02 AM
import java.util.Arrays;

class Solution {

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}