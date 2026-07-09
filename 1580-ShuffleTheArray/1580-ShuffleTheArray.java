// Last updated: 7/9/2026, 9:48:39 AM
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