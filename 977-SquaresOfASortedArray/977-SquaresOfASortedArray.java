// Last updated: 9/7/2026, 1:47:51 PM
class Solution {
    public int[] sortedSquares(int[] nums) {     
        int[] arr=new int[nums.length];  
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}