class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int idx = 0, i = 0, j = 0;

        int[] nums1Copy = Arrays.copyOf(nums1, m);

        while(i < m && j < n) {
            if(nums1Copy[i] < nums2[j]) {
                nums1[idx++] = nums1Copy[i];
                i++;
            }
            else {
                nums1[idx++] = nums2[j];
                j++;
            }
            
        }

        while(i < m) {
            nums1[idx++] =  nums1Copy[i];
            i++;
        }
        while(j < n) {
            nums1[idx++] = nums2[j];
            j++;
        }
    }
}