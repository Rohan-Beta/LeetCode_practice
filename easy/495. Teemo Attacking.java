// 495. Teemo Attacking

//   Example 1:

// Input: timeSeries = [1,4], duration = 2
// Output: 4
// Explanation: Teemo's attacks on Ashe go as follows:
// - At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
// - At second 4, Teemo attacks, and Ashe is poisoned for seconds 4 and 5.
// Ashe is poisoned for seconds 1, 2, 4, and 5, which is 4 seconds in total.
// Example 2:

// Input: timeSeries = [1,2], duration = 2
// Output: 3
// Explanation: Teemo's attacks on Ashe go as follows:
// - At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
// - At second 2 however, Teemo attacks again and resets the poison timer. Ashe is poisoned for seconds 2 and 3.
// Ashe is poisoned for seconds 1, 2, and 3, which is 3 seconds in total.

// solution

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if(timeSeries.length == 0) {
            return 0;
        }
        int ans = 0;

        for(int i = 0; i < timeSeries.length - 1; i += 1) {
            ans += Math.min(timeSeries[i+1] - timeSeries[i] , duration);
        }
        return ans + duration;
    }
}
