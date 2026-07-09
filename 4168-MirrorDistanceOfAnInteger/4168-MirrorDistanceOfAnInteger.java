// Last updated: 7/9/2026, 9:47:00 AM
class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
            
        }
        return Math.abs(a-rev);
    }
}