// Last updated: 7/9/2026, 9:48:43 AM
class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
    var map = new int[1001];

    for (var n : arr) map[n]++;
    for (var n : target) map[n]--;

    return Arrays.equals(map, new int[1001]);
  }
}