// Last updated: 7/9/2026, 9:48:15 AM
class Solution {
    public int minimumSum(int num) {
        int[] ans=new int[4];
        for(int i=3;i>=0;i--){
            ans[i]=num%10;
            num/=10;
        }
        Arrays.sort(ans);
        int n1=ans[0]*10+ans[2];
        int n2=ans[1]*10+ans[3];
        return n1+n2;
    }
}