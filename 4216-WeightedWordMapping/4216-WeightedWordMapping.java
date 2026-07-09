// Last updated: 7/9/2026, 9:46:58 AM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String rev = "zyxwvutsrqponmlkjihgfedcba";
        String ans = "";

        for (int i = 0; i < words.length; i++) {
            int sum = 0;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                sum += weights[ch - 'a'];
            }

            int rem = sum % 26;
            ans += rev.charAt(rem);
        }

        return ans;
    }
}