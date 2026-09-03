// Last updated: 9/3/2026, 2:49:47 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        for (int i = 0; i < n; i++) {
5            for (int j = i + 1; j < n; j++) {
6                int temp = matrix[i][j];
7                matrix[i][j] = matrix[j][i];
8                matrix[j][i] = temp;
9            }
10        }
11        for (int i = 0; i < n; i++) {
12            int l = 0, r = n - 1;
13            while (l < r) {
14                int temp = matrix[i][l];
15                matrix[i][l] = matrix[i][r];
16                matrix[i][r] = temp;
17                l++;
18                r--;
19            }
20        }
21    }
22}