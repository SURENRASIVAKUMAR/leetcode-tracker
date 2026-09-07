// Last updated: 9/7/2026, 1:46:10 PM
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