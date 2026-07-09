// Last updated: 7/9/2026, 9:52:14 AM
class Solution {
    public boolean isPalindrome(String s) {
        String r="";
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        if(s.equals(r)){
            return true;
        }
        else{
            return false;
        }
    }
}