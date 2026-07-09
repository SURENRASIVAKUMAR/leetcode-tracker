// Last updated: 7/9/2026, 9:47:37 AM
class Solution {
    public int differenceOfSums(int n, int m) {
        int s=0;
        int s2=0;
        for(int i=1;i<=n;i++){
            if(i%m !=0){
                s+=i;
            }
            else{
                s2+=i;
            }
        }
        return s-s2;
    }
}