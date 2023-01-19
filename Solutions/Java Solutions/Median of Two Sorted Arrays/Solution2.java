class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = merge(nums1, nums2);

        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        }

        return ((double)mergedArray[mergedArray.length / 2] + (double)mergedArray[(mergedArray.length / 2) - 1]) / 2;
    }
        
    public int[] merge(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
            {
                mergedArray[k] = nums1[i];
                i++;
            } 
            else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}