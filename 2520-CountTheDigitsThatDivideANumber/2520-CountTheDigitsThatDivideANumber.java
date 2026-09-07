// Last updated: 9/7/2026, 1:44:15 PM
class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while (temp > 0) {
            int digit = temp % 10;
            if (num % digit == 0) {
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}