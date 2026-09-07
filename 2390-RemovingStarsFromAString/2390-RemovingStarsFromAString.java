// Last updated: 9/7/2026, 1:44:43 PM
class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        int idx =0;

        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(i>0) ans.delete(idx-1,idx);
                idx--;
            }
            else{
                ans.append(ch);
                idx++;
            }
        }
        return ans.toString();
    }
}