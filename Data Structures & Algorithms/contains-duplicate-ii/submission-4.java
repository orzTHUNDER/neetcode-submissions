class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> se = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(i > k) {
                se.remove(nums[i - k - 1]);
            }

            if(se.contains(nums[i])) return true;

            se.add(nums[i]);

        }

        return false;
    }
}