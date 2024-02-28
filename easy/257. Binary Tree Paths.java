// 257. Binary Tree Paths

//   Input: root = [1,2,3,null,5]
// Output: ["1->2->5","1->3"]
// Example 2:

// Input: root = [1]
// Output: ["1"]

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
    public void dfs(TreeNode root , String curr_path , List<String> ans) {

        curr_path += "->" + root.val;

        if(root.left == null && root.right == null) {
            ans.add(curr_path);
            return;
        }
        if(root.left != null) {
            dfs(root.left , curr_path , ans);
        }
        if(root.right != null) {
            dfs(root.right , curr_path , ans);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        String curr_path = Integer.toString(root.val);

        if(root.left == null && root.right == null) {
            ans.add(curr_path);
        }
        if(root.left != null) {
            dfs(root.left , curr_path , ans);
        }
        if(root.right != null) {
            dfs(root.right , curr_path , ans);
        }
        return ans;
    }
}
