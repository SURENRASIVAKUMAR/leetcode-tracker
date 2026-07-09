// Last updated: 7/9/2026, 9:48:07 AM
class Solution {
    public long appealSum(String s) {
        int vis[] = new int[26];
        Arrays.fill(vis,-1);
        int n = s.length();
        long appealSum = 0;
        for(int i=0 ; i<n ; i++){
            long next = (long)(n-i) , prev;
            prev = (long)(n-i)*(i-vis[s.charAt(i)-'a']-1);
            appealSum+=next+prev;
            vis[s.charAt(i)-'a'] = i;
        }
        return appealSum;
    }
}
