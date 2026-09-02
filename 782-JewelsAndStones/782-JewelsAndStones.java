// Last updated: 9/2/2026, 11:41:03 AM
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