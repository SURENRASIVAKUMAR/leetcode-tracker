// Last updated: 9/7/2026, 1:46:49 PM
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            int min = matrix[i][0];
            int col = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean lucky = true;
            for (int j = 0; j < rows; j++) {
                if (matrix[j][col] > min) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                ans.add(min);
            }
        }
        return ans;
    }
}