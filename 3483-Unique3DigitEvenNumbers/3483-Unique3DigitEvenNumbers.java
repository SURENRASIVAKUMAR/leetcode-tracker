// Last updated: 9/11/2026, 3:15:17 PM
class Solution {
    public int totalNumbers(int[] digits) {
        int c = 0;
        boolean[] used = new boolean[1000];
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) {
                        continue;
                    }
                    if (digits[i] == 0) {
                        continue;
                    }
                    if (digits[k] % 2 != 0) {
                        continue;
                    }
                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (!used[num]) {
                        used[num] = true;
                        c++;
                    }
                }
            }
        }
        return c;
    }
}