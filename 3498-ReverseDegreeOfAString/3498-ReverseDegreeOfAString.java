// Last updated: 9/7/2026, 1:42:42 PM
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