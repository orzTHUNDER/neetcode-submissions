class Solution {
    public int[] productExceptSelf(int[] nums) {

        int ans[] = new int[nums.length];
    boolean oneZero = false;
    boolean moreThanOneZero = false;

    int prod = 1;

    for (int num : nums) {

      if (num == 0) {
        if (oneZero) {
          moreThanOneZero = true;
          prod = 0;
          break;

        }
        oneZero = true;
      } else {
        prod *= num;
      }

    }

    if (moreThanOneZero) {
      Arrays.fill(ans, 0);
      return ans;
    }

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        ans[i] = prod;
      } else {
        if (oneZero) {
          ans[i] = 0;
        } else {
          ans[i] = prod / nums[i];
        }
      }
    }

    return ans;
        
    }
}  
