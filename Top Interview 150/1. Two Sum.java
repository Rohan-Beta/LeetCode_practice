// 1. Two Sum

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// solution

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2];

        for(int i = 0; i < nums.length; i += 1) {
            for(int j = i+1; j < nums.length; j += 1) {

                if(nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
