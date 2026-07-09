// Last updated: 7/9/2026, 9:49:01 AM
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (intervals[j][0] <= intervals[i][0] &&
                    intervals[j][1] >= intervals[i][1]) {

                    flag = true;
                    break;
                }
            }

            if (!flag) {
                count++;
            }
        }
        return count;
    }
}