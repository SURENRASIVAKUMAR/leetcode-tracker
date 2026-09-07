// Last updated: 9/7/2026, 1:47:17 PM
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