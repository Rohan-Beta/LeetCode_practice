// 461. Hamming Distance

//   Example 1:

// Input: x = 1, y = 4
// Output: 2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)
//        ↑   ↑
// The above arrows point to positions where the corresponding bits are different.
// Example 2:

// Input: x = 3, y = 1
// Output: 1

// solution

class Solution {
    public int hammingDistance(int x, int y) {

        int count = 0;

        while(x > 0 || y > 0) {
            count += (x & 1) ^ (y & 1);

            x >>= 1;
            y >>= 1;
        }
        return count;
    }
}
