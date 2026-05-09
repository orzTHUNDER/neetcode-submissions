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

    int pre_idx = 0;
    Map<Integer, Integer> mp = new HashMap<>();

    TreeNode helper(int pre[], int l, int r) {
        if (l > r)
      return null;

    int root_val = pre[pre_idx++];
    TreeNode root = new TreeNode(root_val);

    int mid = mp.get(root_val);
    root.left = helper(pre, l, mid - 1);
    root.right = helper(pre, mid + 1, r);

    return root;
    }

    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
      mp.put(inorder[i], i);
    }
    return helper(preorder, 0, preorder.length - 1);
    }
}
