// Last updated: 7/9/2026, 9:46:51 AM
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 s[i]+=matrix[i][j];
            }
        }
        return s;
    }
}