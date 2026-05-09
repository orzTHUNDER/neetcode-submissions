class Solution {

    void backTrack(int[] nums, int target, List<Integer> li, List<List<Integer>> ans, int i) {

    if (target < 0 || i >= nums.length) {
      return;
    }

    if (target == 0) {
      ans.add(new ArrayList<>(li));
      return;
    }

    li.add(nums[i]);
    backTrack(nums, target - nums[i], li, ans, i);
    li.remove(li.size() - 1);
    backTrack(nums, target, li, ans, i + 1);
  }


    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
    backTrack(nums, target, new ArrayList<>(), ans, 0);
    return ans;
        
    }
}
