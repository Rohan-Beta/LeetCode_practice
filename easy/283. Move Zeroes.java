// 283. Move Zeroes

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

// solution

class Solution {
    public void moveZeroes(int[] nums) {

        int i = 0;

        for(int num : nums) {
            if(num != 0) {
                nums[i++] = num;
            }
        }
        while(i < nums.length) {
            nums[i++] = 0;
        }
    }
}
