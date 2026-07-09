// Last updated: 7/9/2026, 9:50:06 AM
class Solution {
    public int countSegments(String s) {
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("\\s+");
        return words.length;
    }
}