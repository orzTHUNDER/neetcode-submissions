class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // if(k == 0) return false;

        // int l = 0, r = 1, n = nums.length;

        // while(r < n) {
        //     if(r - l > k) {l++; r = l + 1;}
        //     if(nums[l] == nums[r++]) return true;
        // }

        // return false;

        int n = nums.length;
        Map<Integer, Integer> m =  new HashMap<>();
        for(int i = 0; i < k; i++) {
           if(m.put(nums[i], i) != null) return true;
        }

        for(int i = k; i < n; i++) {
            Integer idx = m.get(nums[i]);
            if(idx != null && idx >= i - k) {
                return true;
            }
            m.put(nums[i], i);
        }

        return false;
    }
}