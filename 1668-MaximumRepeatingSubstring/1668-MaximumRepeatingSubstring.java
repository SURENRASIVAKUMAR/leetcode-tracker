// Last updated: 9/7/2026, 1:46:08 PM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k = 0;
        String curr = word;

        while (sequence.contains(curr)) {
            k++;
            curr += word;
        }

        return k;
    }
}