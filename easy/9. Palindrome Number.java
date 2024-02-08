// 9. Palindrome Number

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

// solution

class Solution {
    public boolean isPalindrome(int x) {

        int temp = x;
        int remainder = 0; 
        int reversed = 0;

        while(x != 0) {
            remainder = x % 10;
            reversed = reversed * 10 + remainder;

            x /= 10;
        }
        if(temp == reversed && temp >= 0) {
            return true;
        }
        return false;
    }
}
