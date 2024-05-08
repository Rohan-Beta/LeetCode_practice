// 3. Longest Substring Without Repeating Characters

//   Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

// solution

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int l = 0;

        int res = 0;

        for(int r = 0; r < s.length(); r += 1) {

            while(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l += 1;
            }
            set.add(s.charAt(r));
            res = Math.max(res , r - l + 1);
        }
        return res;
    }
}
