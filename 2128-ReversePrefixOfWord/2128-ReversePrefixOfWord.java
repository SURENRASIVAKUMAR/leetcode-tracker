// Last updated: 7/9/2026, 9:48:20 AM
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