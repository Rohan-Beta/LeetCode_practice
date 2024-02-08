// 1. Two Sum

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]

// solution

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr1[] = new int[2];

      // first solution
      
      // for(int i = 0; i < arr.length-1; i += 1) {
        //     if(nums[i] + nums[i+1] == target) {
        //         arr1[0] = i;
        //         arr1[1] = j;
        //     }
        // }

      // second solution
      
        for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] + nums[i] == target) {
                arr1[0] = i;
                arr1[1] = j;
            }
        }
    }
        return arr1;
    }
}
