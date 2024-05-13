// 202. Happy Number

//   Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// Example 2:

// Input: n = 2
// Output: false

// solution

class Solution {
    public int squaredSum(int n) {
        int sum = 0;

        while(n > 0) {
            sum += Math.pow(n % 10 , 2);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {

        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));

        while(slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }
        return slow == 1 ? true : false;
    }
}
