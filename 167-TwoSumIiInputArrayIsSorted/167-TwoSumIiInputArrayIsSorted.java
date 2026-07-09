// Last updated: 7/9/2026, 9:51:51 AM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int r=numbers[i]+numbers[j];
                if(r==target){
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
             if(r>target){
                break;
             }
            }
        }
        return arr;
    }
}