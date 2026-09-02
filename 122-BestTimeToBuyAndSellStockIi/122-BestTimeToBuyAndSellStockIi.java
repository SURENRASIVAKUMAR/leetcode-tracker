// Last updated: 9/2/2026, 11:45:11 AM
class Solution {
public int maxProfit(int[] prices) {
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p+=prices[i]-prices[i-1];
            }
        }
        return p;
    }
};