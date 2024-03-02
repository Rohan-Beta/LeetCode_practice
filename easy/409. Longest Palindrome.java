// 409. Longest Palindrome.java

//   Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.

// solution

class Solution {
    public int longestPalindrome(String s) {

        int count[] = new int[128];

        for(char ch : s.toCharArray()) {
            count[ch]++;
        }
        int ans = 0;

        for(Integer ch_count : count) {
            ans += (ch_count / 2) * 2;

            if(ans % 2 == 0 && ch_count % 2 == 1) {
                ans += 1;
            }
        }
        return ans;
    }
}
