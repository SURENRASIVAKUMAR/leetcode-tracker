// Last updated: 7/9/2026, 9:49:02 AM
class Solution {
    public int heightChecker(int[] nums) {
        int[] ex=nums.clone();
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(ex[i] !=nums[i]){
                c++;
            }
        }
        return c;
    }
}