// 441. Arranging Coins

//   Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.

//   Input: n = 8
// Output: 3
// Explanation: Because the 4th row is incomplete, we return 3.


// solution

class Solution {
    public int arrangeCoins(int n) {

        if(n <= 0) {
            return 0;
        }
        int count = 1;

        while(n > 0) {

            n = n - count;

            if(n < 0) {
                break;
            }
            count += 1;
        }
        return count - 1;
    }
}
