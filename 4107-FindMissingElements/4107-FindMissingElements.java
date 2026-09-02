// Last updated: 9/2/2026, 10:17:35 AM
import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = min; i <= max; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    count++;
                }
            }
            if (count == 0) {
                result.add(i);
            }
        }
        return result;
    }
}