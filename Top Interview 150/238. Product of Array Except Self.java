// 238. Product of Array Except Self

//   Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// solution

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int ans[] = new int[n];

        int leftProduct[] = new int[n];
        int rightProduct[] = new int[n];

        leftProduct[0] = 1;
        rightProduct[n-1] = 1;

        for(int i = 1; i < n; i += 1) {
            leftProduct[i] = nums[i-1] * leftProduct[i-1];
        }
        for(int i = n-2; i >= 0; i -= 1) {
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }
        for(int i = 0; i < n; i += 1) {
            ans[i] = leftProduct[i] * rightProduct[i];
        }
        return ans;
    }
}
