// 136. Single Number

//   Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1

// solution

class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;

        for(int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
