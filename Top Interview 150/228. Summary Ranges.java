// 228. Summary Ranges

//   Example 1:

// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
// Explanation: The ranges are:
// [0,2] --> "0->2"
// [4,5] --> "4->5"
// [7,7] --> "7"
// Example 2:

// Input: nums = [0,2,3,4,6,8,9]
// Output: ["0","2->4","6","8->9"]
// Explanation: The ranges are:
// [0,0] --> "0"
// [2,4] --> "2->4"
// [6,6] --> "6"
// [8,9] --> "8->9"

// solution

class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> ans = new ArrayList<>();

        for(int i = 0; i < nums.length; i += 1) {
            int start = nums[i];

            while(i+1 < nums.length && nums[i] == nums[i+1] - 1) {
                i += 1;
            }
            int end = nums[i];

            if(start == end) {
                ans.add("" + start);
            }
            else {
                ans.add("" + start + "->" + end);
            }
        }
        return ans;
    }
}
