// Last updated: 9/3/2026, 2:28:58 PM
1class Solution {
2    public boolean isToeplitzMatrix(int[][] matrix) {
3        for (int i = 0; i < matrix.length - 1; i++) {
4            for (int j = 0; j < matrix[i].length - 1; j++) {
5                if (matrix[i][j] != matrix[i + 1][j + 1]) {
6                return false;
7                }
8            }
9        }
10        return true;
11    }
12}