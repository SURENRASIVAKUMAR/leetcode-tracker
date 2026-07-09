// Last updated: 7/9/2026, 9:50:37 AM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right &&
                  "aeiouAEIOU".indexOf(arr[left]) == -1) {
                left++;
            }
            while (left < right &&
                  "aeiouAEIOU".indexOf(arr[right]) == -1) {
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}