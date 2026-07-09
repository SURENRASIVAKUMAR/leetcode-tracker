// Last updated: 7/9/2026, 9:53:39 AM
class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } 
        else if (s.charAt(i) == '+') {
            i++;
        }

        long num = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;

            // Positive overflow
            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            // Negative overflow
            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * num);
    }
}