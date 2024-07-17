package Day2;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for the end of merged array in nums1

        // Start merging from the end of nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
    }
}
}
