// Last updated: 7/9/2026, 9:52:50 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiralMatrix = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int index = 0;
        int num = 1;
        int maxRows = n - 1;
        int minRows = 0;
        int maxCols = n - 1;
        int minCols = 0;
        for (int row = 0, col = 0;
             row >= minRows && col >= minCols && row <= maxRows && col <= maxCols; ) {
            spiralMatrix[row][col] = num++;

            if (index == 0 && col == maxCols) {
                index++;
                minRows++;
            }
            if (index == 1 && row == maxRows) {
                index++;
                maxCols--;
            }
            if (index == 2 && col == minCols) {
                index++;
                maxRows--;
            }

            // If moving up and reached top boundary,
            // turn right and shrink left boundary
            if (index == 3 && row == minRows) {
                index = 0;
                minCols++;
            }

            // Move to next cell based on current direction
            row += directions[index][0];
            col += directions[index][1];
        }

        return spiralMatrix;
    }
}