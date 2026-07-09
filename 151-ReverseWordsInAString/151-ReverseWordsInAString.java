// Last updated: 7/9/2026, 9:52:03 AM
class Solution {
    public String reverseWords(String s) {
         String[] w = s.trim().split("\\s+");
        String r="";
        for(int i=w.length-1;i>=0;i--){
            r+=w[i];
            if(i!=0){
                r+=" ";
            }
        }
        
        return r;
    }
}