// 392. Is Subsequence

//   Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

// solution

class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.isEmpty()) {
            return true;
        }
        int i = 0;

        for(char ch : t.toCharArray()) {
            if(s.charAt(i) == ch && ++i == s.length()) {
                return true;
            }
        }
        return false;
    }
}
