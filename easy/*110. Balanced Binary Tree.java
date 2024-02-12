// 110. Balanced Binary Tree


//   Input: root = [3,9,20,null,null,15,7]
// Output: true

//   Input: root = [1,2,2,3,3,null,null,4,4]
// Output: false
// Example 3:

// Input: root = []
// Output: true

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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
    public boolean isBalanced(TreeNode root) {

        if(root == null) {
            return true;
        }
        return(
            Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 &&
            isBalanced(root.left) &&
            isBalanced(root.right)
        );
    }
}
