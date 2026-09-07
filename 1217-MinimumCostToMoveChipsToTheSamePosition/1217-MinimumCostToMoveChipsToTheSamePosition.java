// Last updated: 9/7/2026, 1:47:21 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
       int even = 0, odd = 0;
        
        for(int p : position){
            if(p%2==0) even++;
            else odd++;
        }
        
        return Math.min(even,odd);  
    }
}