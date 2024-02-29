// 303. Range Sum Query - Immutable

//   Example 1:

// Input
// ["NumArray", "sumRange", "sumRange", "sumRange"]
// [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
// Output
// [null, 1, -1, -3]

// Explanation
// NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
// numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
// numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
// numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

// solution

class NumArray {
    int prefix[];

    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i += 1) {
            prefix[i+1] = nums[i] + prefix[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return(prefix[right + 1] - prefix[left]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
