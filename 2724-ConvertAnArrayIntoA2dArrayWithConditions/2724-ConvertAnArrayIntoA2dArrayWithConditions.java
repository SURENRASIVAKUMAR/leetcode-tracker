// Last updated: 9/2/2026, 10:24:04 AM
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