// Last updated: 9/7/2026, 1:43:38 PM
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) < target){
                    c++;
                }
            }
        }
        return c;
    }
}