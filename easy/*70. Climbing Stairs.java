// 70. Climbing Stairs

//   Example 1:

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps
// Example 2:

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step

// solution

class Solution {
    public int climbStairs(int n) {
        
        int nw[] = new int[n + 1];

        nw[0] = 1;
        nw[1] = 1;

        for(int i = 2; i <= n; i += 1) {
            nw[i] = nw[i-1] + nw[i-2];
        }
        return nw[n];
    }
}
