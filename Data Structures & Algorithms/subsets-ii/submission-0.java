class Solution {

    static void backTrack(int nums[], int idx, List<Integer> tmp, List<List<Integer>> ans) {

    if (idx >= nums.length) {
      ans.add(new ArrayList<>(tmp));
      return;
    }

    // picking
    tmp.add(nums[idx]);
    backTrack(nums, idx + 1, tmp, ans);
    tmp.remove(tmp.size() - 1);
    while (idx <= nums.length - 2 && nums[idx] == nums[idx + 1]) {
      idx++;
    }
    backTrack(nums, idx + 1, tmp, ans);
  }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}
