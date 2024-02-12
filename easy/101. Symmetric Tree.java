// 101. Symmetric Tree

//   Input: root = [1,2,2,3,4,4,3]
// Output: true

//   Input: root = [1,2,2,null,3,null,3]
// Output: false

// solution

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
    public boolean isSymmetric(TreeNode p , TreeNode q) {

        if(p == null || q == null) {
            return p == q;
        }
        return(
            p.val == q.val &&
            isSymmetric(p.left , q.right) &&
            isSymmetric(p.right , q.left)
        );
    }
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root , root);
    }
}
