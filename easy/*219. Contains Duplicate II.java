// 219. Contains Duplicate II

//   Example 1:

// Input: nums = [1,2,3,1], k = 3
// Output: true
// Example 2:

// Input: nums = [1,0,1,1], k = 1
// Output: true
// Example 3:

// Input: nums = [1,2,3,1,2,3], k = 2
// Output: false

// solution

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i += 1) {
            if(!seen.add(nums[i])) {
                return true;
            }
            if(i >= k) {
                seen.remove(nums[i - k]);
            }
        }
        return false;
    }
}
