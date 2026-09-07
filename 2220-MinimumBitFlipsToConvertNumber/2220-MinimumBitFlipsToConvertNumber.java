// Last updated: 9/7/2026, 1:44:59 PM
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