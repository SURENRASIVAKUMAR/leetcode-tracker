// Last updated: 7/9/2026, 9:50:40 AM
class Solution {
    public int integerBreak(int n) {
        if(n<=3)
        return n-1;
        int res=1;
        while(n>4){
            res*=3;
            n-=3;
        }
        return res*n;
    }
}