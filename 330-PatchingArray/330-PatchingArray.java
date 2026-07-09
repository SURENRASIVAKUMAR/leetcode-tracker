// Last updated: 7/9/2026, 9:50:44 AM
class Solution {
    public int minPatches(int[] nums, int n) {
        long till=0,LEN=nums.length;
        int count=0,index=0;
        while(till<n){
            int cur=index>=LEN?n+1:nums[index];
            if(till>=cur-1){
                till+=cur;
                index++;
            }
            else{
                till+=till+1;
                count++;
            }
            
        }

        return count;
    }
}