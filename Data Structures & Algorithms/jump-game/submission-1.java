class Solution {

    public boolean canJump(int[] nums) {
         int i = nums.length - 1;
    int goalIdx = i--;
    while (i >= 0) {
      if ((nums[i] + i) >= goalIdx) {
        goalIdx = i--;
      } else
        i--;
    }
    return goalIdx == 0;
    }
}
