// Last updated: 7/9/2026, 9:47:45 AM
class Solution {
    public int minimizedStringLength(String s) {
        return (int) s.chars().distinct().count();
    }
}