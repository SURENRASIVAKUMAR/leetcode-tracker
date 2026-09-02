// Last updated: 9/2/2026, 10:18:18 AM
class Solution {
    public long maxProduct(int[] nums) {
        //get max number in nums
        int max = 0;
        for(int num : nums) {
            if(max < num) max = num;
        }
        max = fillBits(max); //turn max number into a full mask of 1s (ex: 1001010 turns into 1111111)

        int[] dp = new int[max + 1]; //dp[i] = greatest submask of 'i' in nums
        for(int num : nums) dp[num] = num; //fill out base cases

        //now we must fully update the dp array
        for(int i = 1; i < max; i++) { //for each possible bitmask
            if(dp[i] != 0) {
                //one by one, for each 0 bit in 'i', we consider a new 'i' with that bit set to 1
                //we then update the value at this new 'i' to the max of the new 'i' and the old 'i'

                int mask = ~i & max; //mask = inverse of 'i', clamped to the max number's binary length
                while(mask > 0) {
                    int low = mask & -mask; //low = lowest 1 bit in 'mask', which is a 0 bit in 'i'
                    if(dp[i | low] < dp[i]) dp[i | low] = dp[i]; //update the new 'i' (new 'i' = i | low)
                    mask ^= low; //remove the lowest 1 bit from 'mask'
                }
            }
        }

        //go through nums and find the largest product
        long ans = 0;
        for(int num : nums) {
            int mask = ~num & max; //mask = inverse of 'num', clamped to the max number's binary length

            //dp[mask] = largest submask of 'mask' in nums (greatest number with no shared bits)
            if(dp[mask] != 0) { 
                long val = (long)num * dp[mask]; //largest product we can make with 'num'
                if(val > ans) ans = val;
            }
        }
        return ans;
    }
    private static int fillBits(int max) {
        //bit trick to turn a number into a full mask
        max |= max >>> 1;
        max |= max >>> 2;
        max |= max >>> 4;
        max |= max >>> 8;
        max |= max >>> 16;
        return max;
    }
}