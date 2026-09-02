// Last updated: 9/2/2026, 11:38:50 AM
class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start ^ goal;
        int count = 0;
        while (x > 0) {
            count += x % 2;
            x /= 2;
        }
        return count;
    }
}