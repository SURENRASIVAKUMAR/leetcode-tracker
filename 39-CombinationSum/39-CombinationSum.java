// Last updated: 7/9/2026, 9:53:05 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, ans, new ArrayList<>());

        return ans;
    }
    public void backtrack(int[] arr,
                          int target,
                          int start,
                          List<List<Integer>> ans,
                          List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Try every possible element
        for (int i = start; i < arr.length; i++) {

            // Pruning
            // No need to continue if current element exceeds target
            if (arr[i] > target) break;

            // Choose current element
            ds.add(arr[i]);

            // Recurse
            // Pass i again because reuse is allowed
            backtrack(arr, target - arr[i], i, ans, ds);

            // Backtrack
            // Remove last chosen element
            ds.remove(ds.size() - 1);
        }
    }
}