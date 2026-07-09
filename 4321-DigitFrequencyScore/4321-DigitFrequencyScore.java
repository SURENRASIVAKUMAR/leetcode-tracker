// Last updated: 7/9/2026, 9:46:50 AM
class Solution {
    public int digitFrequencyScore(int n) {
        int c=0;
            while(n>0){
             c+=n%10;
                n/=10;
                
            }
        return c ;
    }
}