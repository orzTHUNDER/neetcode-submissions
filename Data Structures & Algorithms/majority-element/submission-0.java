class Solution {
    public int majorityElement(int[] nums) {

        int canditate = nums[0];
        int cnt = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == canditate) cnt++;
            else
                cnt--;
            
            if(cnt < 0) {
                canditate = nums[i];
                cnt = 1;
            }

        }
        return canditate;
    }
}