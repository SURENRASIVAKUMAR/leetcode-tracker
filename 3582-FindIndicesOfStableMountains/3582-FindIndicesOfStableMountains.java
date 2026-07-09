// Last updated: 7/9/2026, 9:47:22 AM
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