// 459. Repeated Substring Pattern.java

// Example 1:

// Input: s = "abab"
// Output: true
// Explanation: It is the substring "ab" twice.
// Example 2:

// Input: s = "aba"
// Output: false
// Example 3:

// Input: s = "abcabcabcabc"
// Output: true
// Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

// solution

class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String ss = s + s;

        return ss.substring(1 , ss.length() - 1).contains(s);
    }
}
