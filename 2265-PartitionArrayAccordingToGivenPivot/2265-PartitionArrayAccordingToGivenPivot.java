// Last updated: 7/9/2026, 9:48:13 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int k=0; 

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[k++]=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ans[k++]=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                ans[k++]=nums[i];
            }
        }
        return ans;
    }
}