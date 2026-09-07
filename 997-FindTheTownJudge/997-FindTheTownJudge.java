// Last updated: 9/7/2026, 1:47:46 PM
public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        
        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];
            outDegree[a]++;
            inDegree[b]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (outDegree[i] == 0 && inDegree[i] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}
