// Last updated: 9/7/2026, 2:05:10 PM
1import java.util.*;
2class Solution {
3    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
4        int[][] ans = new int[rows * cols][2];
5        int k = 0;
6        for (int r = 0; r < rows; r++) {
7            for (int c = 0; c < cols; c++) {
8                ans[k][0] = r;
9                ans[k][1] = c;
10
11                k++;
12            }
13        }
14        Arrays.sort(ans, (a, b) -> {
15            int distanceA = Math.abs(a[0] - rCenter)
16                          + Math.abs(a[1] - cCenter);
17            int distanceB = Math.abs(b[0] - rCenter)
18                          + Math.abs(b[1] - cCenter);
19            return distanceA - distanceB;
20        });
21        return ans;
22    }
23}