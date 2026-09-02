// Last updated: 9/2/2026, 11:40:27 AM
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                b++;
            } else if (ch == 'a') {
                a++;
            } else if (ch == 'l') {
                l++;
            } else if (ch == 'o') {
                o++;
            } else if (ch == 'n') {
                n++;
            }
        }
        l = l / 2;
        o = o / 2;
        int ans = Math.min(b, a);
        ans = Math.min(ans, l);
        ans = Math.min(ans, o);
        ans = Math.min(ans, n);
        return ans;
    }
}