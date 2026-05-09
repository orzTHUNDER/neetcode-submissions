class Solution {

    public int binarySearch(int l, int r, int nums[], int target) {

    if (r < l) {
      return -1;
    }

    int mid = (r + l) / 2;

    if (nums[mid] == target)
      return mid;

    else if (nums[mid] > target) {
      return binarySearch(0, r - 1, nums, target);
    }

    else {
      return binarySearch(l + 1, r, nums, target);
    }

  }


    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
}
