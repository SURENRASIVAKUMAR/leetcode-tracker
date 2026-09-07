// Last updated: 9/7/2026, 1:42:34 PM
class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                smax = max;
                max = digit;
            } else if (digit > smax) {
                smax = digit;
            }
            n = n / 10;
        }
        return max * smax;
    }
}