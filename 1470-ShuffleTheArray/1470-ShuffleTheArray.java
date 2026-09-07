// Last updated: 9/7/2026, 1:46:25 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r=new int[2*n];
        int in=0;
        for(int i=0;i<n;i++){
            r[in++]=nums[i];
            r[in++]=nums[i+n];
        }
        return r;
    }
}