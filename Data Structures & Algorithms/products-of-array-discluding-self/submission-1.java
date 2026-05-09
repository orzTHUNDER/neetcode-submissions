class Solution {
    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
    boolean oneZero = false;

    int prod = 1;

    for (int num : nums) {

      if (num == 0) {
        if (oneZero) {
          Arrays.fill(ans, 0);
          return ans;
        }
        oneZero = true;
      } else {
        prod *= num;
      }

    }

    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i] == 0 ? prod : oneZero ? 0 : prod / nums[i];
    }

    return ans;
        
    }
}  
