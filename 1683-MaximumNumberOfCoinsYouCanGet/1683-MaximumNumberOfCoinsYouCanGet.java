// Last updated: 7/9/2026, 9:48:34 AM
import java.util.Arrays;
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int ans = 0;
        for (int i = n - 2; i >= n / 3; i -= 2) {
            ans += piles[i];
        }
        return ans;
    }
}