// 448. Find All Numbers Disappeared in an Array

//   Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]

  // solution

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for(int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = -1 * Math.abs(nums[index]);
        }
        for(int i = 0; i < nums.length; i += 1) {
            if(nums[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
