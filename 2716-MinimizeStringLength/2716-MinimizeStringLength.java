// Last updated: 9/7/2026, 1:43:49 PM
class Solution {
    public int minimizedStringLength(String s) {
        return (int) s.chars().distinct().count();
    }
}