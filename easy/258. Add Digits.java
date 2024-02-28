// 258. Add Digits.java
  
// Example 1:

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
// Example 2:

// Input: num = 0
// Output: 0

// solution

class Solution {
    public int addDigits(int num) {

        return (1 + (num - 1) % 9);
    }
}
