// Last updated: 9/7/2026, 1:41:03 PM
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