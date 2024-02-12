// 100. Same Tree

//   Input: p = [1,2,3], q = [1,2,3]
// Output: true

//   Input: p = [1,2], q = [1,null,2]
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p == null || q == null) {
            return p == q;
        }
        return(p.val == q.val &&
                isSameTree(p.left , q.left) &&
                isSameTree(p.right , q.right)
        );
    }
}
