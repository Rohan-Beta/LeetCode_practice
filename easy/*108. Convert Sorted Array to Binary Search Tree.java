// 108. Convert Sorted Array to Binary Search Tree

//   Input: nums = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: [0,-10,5,null,-3,null,9] is also accepted:

// Input: nums = [1,3]
// Output: [3,1]
// Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.

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
    public TreeNode buildTree(int nums[] , int left , int right) {
        if(left > right) {
            return null;
        }
        int m = (left + right) / 2;

        return new TreeNode(nums[m] , buildTree(nums , left , m - 1) , buildTree(nums , m + 1 , right));
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums , 0 , nums.length - 1);
    }
}
