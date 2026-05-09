/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    boolean helper(TreeNode root, int mini, int maxi) {
    if (root == null)
      return true;
    if (root.val >= maxi || root.val <= mini) {
      return false;
    }
    return helper(root.left, mini, root.val) && helper(root.right, root.val, maxi);
  }

    public boolean isValidBST(TreeNode root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
