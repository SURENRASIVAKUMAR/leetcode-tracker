// Last updated: 9/7/2026, 1:48:25 PM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                return false;
                }
            }
        }
        return true;
    }
}