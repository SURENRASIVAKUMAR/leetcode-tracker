// Last updated: 7/9/2026, 9:47:30 AM
class Solution {
    public int scoreOfString(String s) {
        int r = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);

            int ascii1 = (int) ch1;
            int ascii2 = (int) ch2;

            r += Math.abs(ascii1 - ascii2);
        }

        return r;
    }
}