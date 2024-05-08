// 209. Minimum Size Subarray Sum

//   Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1

// solution

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l = 0;
        int total = 0;

        int res = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r += 1) {
            total += nums[r];

            while(total >= target) {
                
                res = Math.min(res , r-l+1);
                total -= nums[l];
                l += 1;
            }
        }
        return res == Integer.MAX_VALUE? 0 : res;
    }
}
