class Solution {

   public int bSearch(int nums[], int target, int l, int r) {

      if(l > r) return -1;

      int mid = l + (r-l)/2;

       if(nums[mid] < target) 
            return bSearch(nums, target, mid + 1, r);

      else if(nums[mid] > target)
          return bSearch(nums, target, l, mid - 1);

      else
        return mid;

   }

    public int search(int[] nums, int target) {

      // int l = 0, r = nums.length - 1;

      // while(l <= r) {

      //   int mid = l + (r-l)/2;

      //   if(nums[mid] < target) l = mid + 1;
      //   else if(nums[mid] > target) r = mid - 1;

      //   else return mid;


      // }

      // return -1;
      return bSearch(nums, target, 0, nums.length - 1);
    }
}
