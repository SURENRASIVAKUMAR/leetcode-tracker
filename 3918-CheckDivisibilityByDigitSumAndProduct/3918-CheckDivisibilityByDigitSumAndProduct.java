// Last updated: 9/2/2026, 10:18:15 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int s = 0;
        int p = 1;
        while (n > 0) {
            int d = n % 10;
            s += d;
            p *= d;
            n /= 10;
        }
        int r = s + p;
        if (original % r == 0) {
            return true;
        } else {
            return false;
        }
    }
}