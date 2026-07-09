// Last updated: 7/9/2026, 9:51:47 AM
class Solution {
    public int titleToNumber(String columnTitle) {
        int r=0;
        for(int i=0;i<columnTitle.length();i++){
            r=r*26+(columnTitle.charAt(i)-'A'+1);
        }
        return r;
    }
}