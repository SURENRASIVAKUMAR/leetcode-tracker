// Last updated: 9/3/2026, 2:10:17 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += mat[i][i];
            s += mat[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            s -= mat[n / 2][n / 2];
        }
        return s;
    }
}