// 15. 3Sum

//   Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.

// solution

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length < 3) {
            return new ArrayList<>();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i += 1) {

            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length - 1;

            while(l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];

                if(threeSum < 0) {
                    l += 1;
                }
                else if(threeSum > 0) {
                    r -= 1;
                }
                else {
                    ans.add(Arrays.asList(nums[i] , nums[l] , nums[r]));
                    l += 1;

                    while(nums[l] == nums[l-1] && l < r) {
                        l += 1;
                    }
                }
            }
        }
        return ans;
    }
}
