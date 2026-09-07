// Last updated: 9/7/2026, 1:45:51 PM
class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int Operations=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j) =='1'){
                     Operations += Math.abs(i - j);
                }
            }
            ans[i]=Operations;
        }
        return ans;
    }
}