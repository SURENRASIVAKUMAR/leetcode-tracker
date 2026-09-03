// Last updated: 9/3/2026, 2:17:48 PM
1class Solution {
2    public List<Integer> luckyNumbers (int[][] matrix) {
3        List<Integer> ans = new ArrayList<>();
4        int rows = matrix.length;
5        int cols = matrix[0].length;
6        for (int i = 0; i < rows; i++) {
7            int min = matrix[i][0];
8            int col = 0;
9            for (int j = 0; j < cols; j++) {
10                if (matrix[i][j] < min) {
11                    min = matrix[i][j];
12                    col = j;
13                }
14            }
15            boolean lucky = true;
16            for (int j = 0; j < rows; j++) {
17                if (matrix[j][col] > min) {
18                    lucky = false;
19                    break;
20                }
21            }
22            if (lucky) {
23                ans.add(min);
24            }
25        }
26        return ans;
27    }
28}