// 485. Max Consecutive Ones

//   Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

// solution

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int ans = 0;
        int count = 0;

        for(int num : nums) {
            if(num == 1) {
                ans = Math.max(ans , ++count);
            }
            else {
                count = 0;
            }
        }
        return ans;
    }
}
