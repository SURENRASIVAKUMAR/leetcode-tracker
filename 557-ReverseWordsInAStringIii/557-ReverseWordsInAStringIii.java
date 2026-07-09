// Last updated: 7/9/2026, 9:49:47 AM
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse(); 
            reversed.append(reversedWord).append(" "); 
        }
        return reversed.toString().trim();
    }
}