// Last updated: 7/9/2026, 9:48:55 AM
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int d = String.valueOf(nums[i]).length();
            if(d%2==0){
                c++;
            }
        }
        return c;
    }
}