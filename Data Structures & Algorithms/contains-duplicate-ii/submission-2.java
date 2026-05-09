class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(k == 0) return false;

        int l = 0, r = 1, n = nums.length;

        while(r < n) {
            if(r - l > k) {l++; r = l + 1;}
            if(nums[l] == nums[r++]) return true;
        }
        return false;
    }
}