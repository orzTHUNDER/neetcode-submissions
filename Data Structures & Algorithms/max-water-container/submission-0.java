class Solution {
    public int maxArea(int[] heights) {

        int ans = Integer.MIN_VALUE;

    int i = 0, j = heights.length - 1;
    while (i < j) {
      if (heights[i] < heights[j]) {
        ans = Math.max(ans, heights[i] * (j - i));
        i++;
      } else if (heights[i] > heights[j]) {
        ans = Math.max(ans, heights[j] * (j - i));
        j--;
      } else {
        ans = Math.max(ans, heights[i] * (j - i));
        i++;
        j--;
      }
    }
    return ans;
        
    }
}
