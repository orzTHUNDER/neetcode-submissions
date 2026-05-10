class Solution {
    public int removeDuplicates(int[] nums) {

       int l = 1, r = 1, n = nums.length;

       while(r < n) {

        if(nums[r - 1] == nums[r]) r++;
        else {
            nums[l] = nums[r];
            l++;
            r++;
        }

       }
       return l;
    }
}