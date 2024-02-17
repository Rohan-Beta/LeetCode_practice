// 191. Number of 1 Bits

//   Example 1:

// Input: n = 00000000000000000000000000001011
// Output: 3
// Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
// Example 2:

// Input: n = 00000000000000000000000010000000
// Output: 1
// Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
// Example 3:

// Input: n = 11111111111111111111111111111101
// Output: 31
// Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.

// solution

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int count = 0;

        for(int i = 0; i < 32; i += 1) {
            if((n >> i & 1) == 1) {
                count += 1;
            }
        }
        return count;
    }
}
