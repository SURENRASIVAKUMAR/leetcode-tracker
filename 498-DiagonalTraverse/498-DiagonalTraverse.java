// Last updated: 9/7/2026, 1:56:59 PM
1class Solution {
2    public int[] findDiagonalOrder(int[][] mat) {
3        int rows = mat.length;
4        int cols = mat[0].length;
5        int[] ans = new int[rows * cols];
6        int row = 0;
7        int col = 0;
8        int index = 0;
9        boolean up = true;
10        while (index < rows * cols) {
11            ans[index++] = mat[row][col];
12            if (up) {
13                if (col == cols - 1) {
14                    row++;
15                    up = false;
16                }
17                else if (row == 0) {
18                    col++;
19                    up = false;
20                }
21                else {
22                    row--;
23                    col++;
24                }
25            }
26            else {
27                if (row == rows - 1) {
28                    col++;
29                    up = true;
30                }
31                else if (col == 0) {
32                    row++;
33                    up = true;
34                }
35                else {
36                    row++;
37                    col--;
38                }
39            }
40        }
41        return ans;
42    }
43}