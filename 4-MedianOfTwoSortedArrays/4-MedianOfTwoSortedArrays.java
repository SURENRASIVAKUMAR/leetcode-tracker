// Last updated: 7/9/2026, 9:53:44 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;

        int medianIndex1 = (totalLength - 1) / 2;
        int medianIndex2 = totalLength / 2;

        int i = 0, j = 0, count = 0;
        int current = 0, previous = 0;

        while (count <= medianIndex2) {
            previous = current;
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                current = nums1[i++];
            } else {
                current = nums2[j++];
            }
            count++;
        }

        if (totalLength % 2 == 0) {
            return (previous + current) / 2.0;
        }
        return current;
    }
}