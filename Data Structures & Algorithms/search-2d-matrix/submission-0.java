class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i = 0, j = matrix.length - 1;
    int n = matrix[0].length - 1;

    // Finding the row
    while (i != j) {
      int mid = (i + j) / 2;
      if (matrix[mid][n] < target) {
        i = mid + 1;
      } else {
        j = mid;
      }
    }

    /// BS in col
    int l = 0, r = n;
    while (l <= r) {
      int mid = (l + r) / 2;

      if (matrix[i][mid] > target) {
        r = mid - 1;
      } else if (matrix[i][mid] < target) {
        l = mid + 1;
      } else {
        return true;
      }
    }

    return false;
        
    }
}
