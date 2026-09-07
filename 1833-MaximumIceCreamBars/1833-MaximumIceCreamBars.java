// Last updated: 9/7/2026, 1:45:40 PM
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