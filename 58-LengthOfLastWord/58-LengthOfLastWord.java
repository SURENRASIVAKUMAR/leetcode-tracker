// Last updated: 7/9/2026, 9:52:52 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] w=s.trim().split(" ");
        return w[w.length-1].length();
    }
}