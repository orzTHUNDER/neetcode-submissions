class Solution {
    public int searchInsert(int[] a, int target) {

        int l = 0, n = a.length, r = n - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(a[mid] > target) r = mid - 1;
            else if(a[mid] < target) l = mid + 1;
            else return mid;
        }
        return l;
        
    }
}