class Solution {

    boolean helper(int nums[], int x) {
    if (x >= nums.length - 1)
      return true;
    if (nums[x] == 0)
      return false;
    boolean ans = false;
    for (int i = x + 1; i <= nums[x] + x; i++) {
      ans = ans || helper(nums, i);
    }

    return ans;
  }

    public boolean canJump(int[] nums) {
         return helper(nums, 0);
    }
}
