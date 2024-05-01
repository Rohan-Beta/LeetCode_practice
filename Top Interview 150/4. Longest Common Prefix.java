// 4. Longest Common Prefix

//   Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.

// solution

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result = strs[0];

        for(int i = 0; i < strs.length; i += 1) {

            while(strs[i].indexOf(result) != 0) {
                result = result.substring(0 , result.length() - 1);
            }
            if(result.isEmpty()) {
                return "";
            }
        }
        return result;
    }
}
