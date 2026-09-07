// Last updated: 9/7/2026, 1:45:22 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int firstOccurence = word.indexOf(ch);
        if (firstOccurence == -1) {
            return word;
        }
        StringBuilder sb = new StringBuilder(word.substring(0, firstOccurence + 1)).reverse();
        if (firstOccurence < word.length()) {
            sb.append(word.substring(firstOccurence + 1));
        }
        return sb.toString();
    }
}