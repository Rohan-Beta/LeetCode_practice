// 169. Majority Element

//   Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

// solution

class Solution {
    public int majorityElement(int[] nums) {

        int ans = 0;
        int count = 0;

        for(int num : nums) {
            if(count == 0) {
                ans = num;
            }
            count += ans == num ? 1 : -1;
        }
        return ans;
    }
}
