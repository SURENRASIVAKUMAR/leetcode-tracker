// Last updated: 7/9/2026, 9:49:28 AM
public class Solution {
    public int pivotIndex(int[] nums) {
        int Sum = 0;
        int left = 0;
        for (int num : nums) {
            Sum += num;
        }        
        for (int i = 0; i < nums.length; i++) {
            if (left == Sum - left - nums[i]) {
                return i; 
            }
            left += nums[i]; 
        }
                return -1;
    }
}
