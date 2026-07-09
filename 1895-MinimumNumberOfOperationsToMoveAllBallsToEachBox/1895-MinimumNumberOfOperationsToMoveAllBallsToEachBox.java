// Last updated: 7/9/2026, 9:48:27 AM
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