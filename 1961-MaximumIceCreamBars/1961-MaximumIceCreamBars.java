// Last updated: 9/2/2026, 11:39:21 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n = 0;
        for(int i = 0; i<costs.length; i++){
            if(coins<=0 || costs[i]>coins){
                break;
            }
            n++;
            coins-=costs[i];
        }
        return n;
    }
}