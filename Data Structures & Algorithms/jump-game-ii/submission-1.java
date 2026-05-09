class Solution {



    public int jump(int[] nums) {

        if (nums.length == 1)
      return 0;

    int l = 0, r = 0;
    int ans = 0;
    while (r <= nums.length - 1) {
      int farthestIdx = -1;
      for (int i = l; i <= r; i++) {
        farthestIdx = Math.max(farthestIdx, i + nums[i]);
        if (farthestIdx >= nums.length - 1)
          return ++ans;
      }
      l++;
      r = farthestIdx;
      ans++;
    }
    return ans;
        
    }
}
