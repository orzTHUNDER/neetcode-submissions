class Solution {
    public int removeElement(int[] nums, int val) {

        int l = 0, r = 0;

        while(r < nums.length) {

            if(nums[l] == val) {
                while(nums[r] == val) {
                    r++;
                    if(r >= nums.length) return l;
                }

                
                nums[l] = nums[r];
                nums[r] = val;
            }
            l++;
            r++;
        }

        return l;
        
    }
}