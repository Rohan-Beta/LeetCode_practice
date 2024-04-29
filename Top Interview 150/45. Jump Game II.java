// 45. Jump Game II

//   Example 1:

// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [2,3,0,1,4]
// Output: 2

// solution

class Solution {
    public int jump(int[] nums) {

        int res = 0;
        int l = 0;
        int r = 0;

        while(r < nums.length - 1) {
            int farthest = 0;

            for(int i = l; i < r+1; i += 1) {
                farthest = Math.max(farthest , i + nums[i]);
            }
            l = r+1;
            r = farthest;
            res += 1;
        }
        return res;
    }
}
