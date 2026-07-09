// Last updated: 7/9/2026, 9:50:09 AM
import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(nums[i] != nums[i + 1]) {
                count++;
                if(count == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}