// Last updated: 9/7/2026, 1:48:21 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
		for (int i = 0 ; i < stones.length(); i ++) {
			if(jewels.indexOf(stones.charAt(i)) != -1) {
				num++;
			}
		}
		return num;
    }
}