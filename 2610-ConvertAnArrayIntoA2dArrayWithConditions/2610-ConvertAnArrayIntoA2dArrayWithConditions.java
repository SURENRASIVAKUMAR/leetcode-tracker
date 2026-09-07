// Last updated: 9/7/2026, 1:44:02 PM
import java.util.*;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] freq = new int[201];
        for (int num : nums) {
            if (freq[num] == ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(freq[num]).add(num);
            freq[num]++;
        }
        return ans;
    }
}