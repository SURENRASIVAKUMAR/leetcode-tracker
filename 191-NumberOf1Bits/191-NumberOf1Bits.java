// Last updated: 7/9/2026, 9:51:39 AM
class Solution {
    public static int hammingWeight(int n) {
	int ones = 0;
    	while(n!=0) {
    		ones = ones + (n & 1);
    		n = n>>>1;
    	}
    	return ones;
}
}