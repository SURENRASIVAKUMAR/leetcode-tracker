// Last updated: 9/2/2026, 11:39:34 AM
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (digit > max) {
                max = digit;
            }
        }
        return max;
    }
}