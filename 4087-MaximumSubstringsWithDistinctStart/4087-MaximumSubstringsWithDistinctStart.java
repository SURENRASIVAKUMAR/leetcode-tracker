// Last updated: 7/9/2026, 9:47:02 AM
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