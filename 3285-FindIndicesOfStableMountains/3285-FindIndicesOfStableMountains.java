// Last updated: 9/7/2026, 1:42:58 PM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ans = new LinkedList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                ans.add(i);
            }
        }

        return ans;
    }
}