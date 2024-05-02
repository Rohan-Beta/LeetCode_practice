// 2441. Largest Positive Integer That Exists With Its Negative

//   Example 1:

// Input: nums = [-1,2,-3,3]
// Output: 3
// Explanation: 3 is the only valid k we can find in the array.
// Example 2:

// Input: nums = [-1,10,6,7,-7,1]
// Output: 7
// Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.

// solution

class Solution {
    public int findMaxK(int[] nums) {

        int max = 0;
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {

            if(set.contains(-num)) {
                max = Math.max(max , Math.abs(num));
            }
            else {
                set.add(num);
            }
        }
        return max == 0? -1 : max;
    }
}
