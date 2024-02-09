// 35. Search Insert Position

//   Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

// solution

class Solution {
    public int searchInsert(int[] nums, int target) {

        int i;

        for(i = 0; i < nums.length; i += 1) {
            if(nums[i] == target) {
                return i;
            }
            else if(nums[i] > target) {
                return i;
            }
        }
        return i;
    }
}
