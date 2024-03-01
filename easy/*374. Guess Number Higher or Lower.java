// 374. Guess Number Higher or Lower

//   Example 1:

// Input: n = 10, pick = 6
// Output: 6
// Example 2:

// Input: n = 1, pick = 1
// Output: 1
// Example 3:

// Input: n = 2, pick = 1
// Output: 1

// solution

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int l = 1;
        int h = n;

        while(l < h) {
            int m = l + (h - l) / 2;

            if(guess(m) <= 0) {
                h = m;
            }
            else {
                l = m + 1;
            }
        }
        return l;
    }
}
