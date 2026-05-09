class Solution {
    public int longestConsecutive(int[] nums) {

    if(nums.length == 0) {
        return 0;
    }
        int ans = 1;
        Arrays.sort(nums);
    int i = 0;
     while (i < nums.length) {
      int j = i + 1;
      int cnt = 1;
      int prev = i;
      while (j < nums.length && (nums[j] == nums[prev] || nums[j] == nums[prev] + 1)) {
        if (nums[prev] != nums[j]) {
          cnt++;
          prev = j++;
        } else {
          j++;
        }

      }
      if (cnt > ans)
        ans = cnt;
      i = j;
    }
    return ans;
        
    }
}
