// Last updated: 9/2/2026, 10:23:11 AM
class Solution {
    public int reverseDegree(String s) {
        int ans = 0, idx = 1;
        for (char ch : s.toCharArray()) {
            ans += (123 - (int) ch) * idx;
            idx++;
        }
        return ans;
    }
}