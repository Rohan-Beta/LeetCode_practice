// 367. Valid Perfect Square

//   Example 1:

// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
// Example 2:

// Input: num = 14
// Output: false
// Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

  // solution

class Solution {
    public boolean isPerfectSquare(int num) {

        for(int i = 1; i < num + 1; i += 1) {
            if(i * i == num) {
                return true;
            }
            if(i * i > num) {
                return false;
            }
        }
        return false;
    }
}
