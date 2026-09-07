// Last updated: 9/7/2026, 1:42:00 PM
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int[] ans=new int[n];
        int k=0;
        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[k]=order[i];
                    k++;
                    break;
                }
            }
        }
        return ans;
    }
}