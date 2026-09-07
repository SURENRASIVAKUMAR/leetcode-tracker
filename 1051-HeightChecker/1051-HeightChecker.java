// Last updated: 9/7/2026, 1:47:38 PM
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