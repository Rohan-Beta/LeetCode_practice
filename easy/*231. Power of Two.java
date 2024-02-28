// 231. Power of Two

//   Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16
// Example 3:

// Input: n = 3
// Output: false

// solution: 1

class Solution {
    public boolean isPowerOfTwo(int n) {

        int x = 0;

        while(x < n) {
            if(Math.pow(2 , x) == n) {
                return true;
            }
            x += 1;
        }
        return false;
    }
}

// solution: 2

class Solution {
    public boolean isPowerOfTwo(int n) {

        return n < 0? false : Integer.bitCount(n) == 1;
    }
}
