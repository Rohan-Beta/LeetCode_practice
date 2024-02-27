// 222. Count Complete Tree Nodes

//   Input: root = [1,2,3,4,5,6]
// Output: 6
// Example 2:

// Input: root = []
// Output: 0
// Example 3:

// Input: root = [1]
// Output: 1

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
    public int countNodes(TreeNode root) {

        if(root == null) {
            return 0;
        }
        
        int left_level = 1;
        TreeNode l = root.left;

        while(l != null) {
            l = l.left;
            left_level += 1;
        }
        int right_level = 1;
        TreeNode r = root.right;

        while(r != null) {
            r = r.right;
            right_level += 1;
        }
        if(left_level == right_level) {
            return (int)(Math.pow(2 , left_level) - 1);
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
