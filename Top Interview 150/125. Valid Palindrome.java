// 125. Valid Palindrome

//   Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// solution

class Solution {
    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while(l < r) {

            while(l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l += 1;
            }
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r -= 1;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }
}
