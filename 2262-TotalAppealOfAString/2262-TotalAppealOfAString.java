// Last updated: 9/7/2026, 1:44:50 PM
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
