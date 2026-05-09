class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
    Arrays.sort(nums);
    // -4, -1, -1, 0, 1, 2
    int i = 0;
    while (i < nums.length) {
      if (nums[i] > 0) {
        break;
      }
      int j = i + 1;
      int k = nums.length - 1;
      int target = -1 * nums[i];
      while (j < k && j < nums.length && k > i) {
        if (nums[j] + nums[k] == target) {
          ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
        } else if (nums[j] + nums[k] < target) {
          j++;
        } else {
          k--;
        }
      }
      i++;
    }

    return ans.stream().collect(Collectors.toList());
    }
}
