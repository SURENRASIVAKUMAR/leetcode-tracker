// Last updated: 9/7/2026, 1:41:54 PM
class Solution {
    public int maxDistinct(String s) {
        int[] freq = new int[26];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch - 'a'] == 0) {
                count++;
                freq[ch - 'a'] = 1;
            }
        }

        return count;
    }
}