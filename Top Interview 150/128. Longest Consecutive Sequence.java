// 128. Longest Consecutive Sequence

//   Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9

// solution

class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            seen.add(num);
        }
        int maxSequenceLen = 0;

        for(int num : nums) {

            if(!seen.contains(num - 1)) {
                int currSequenceLen = 0;

                while(seen.contains(num + currSequenceLen)) {
                    currSequenceLen += 1;
                }
                maxSequenceLen = Math.max(maxSequenceLen , currSequenceLen);
            }
        }
        return maxSequenceLen;
    }
}
