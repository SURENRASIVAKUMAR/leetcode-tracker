// Last updated: 7/9/2026, 9:49:42 AM
import java.util.Arrays;
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int start = 0;
int end = nums.length - 1;
        while (start < nums.length && nums[start] == temp[start]) {
            start++;
        }

        while (end > start && nums[end] == temp[end]) {
            end--;
        }

        return end - start + 1;
    }
}