// Last updated: 9/2/2026, 11:40:22 AM
class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int r=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                l++;
            }else{
                r++;
            }
            if(l==r){
                c++;
            }
        }
       return c;
    }
}