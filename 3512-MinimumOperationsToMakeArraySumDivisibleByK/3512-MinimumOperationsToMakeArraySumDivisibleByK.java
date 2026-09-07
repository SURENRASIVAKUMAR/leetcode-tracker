// Last updated: 9/7/2026, 1:42:37 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int s = 0;
        int c = 0;
        for(int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        if(s % k == 0) {
            return 0;
        }
        for(int x = s; x >= 0; x--) {
            if(x % k == 0) {
                break;
            }
            c++;
        }
        return c;
    }
}