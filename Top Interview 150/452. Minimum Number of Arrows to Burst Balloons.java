// 452. Minimum Number of Arrows to Burst Balloons

//   Example 1:

// Input: points = [[10,16],[2,8],[1,6],[7,12]]
// Output: 2
// Explanation: The balloons can be burst by 2 arrows:
// - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
// - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
// Example 2:

// Input: points = [[1,2],[3,4],[5,6],[7,8]]
// Output: 4
// Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.

// solution

class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points , (arr1 , arr2) -> Integer.compare(arr1[1] , arr2[1]));

        int ans = 1;
        int prev = points[0][1];

        for(int i = 1; i < points.length; i += 1) {
            int curr = points[i][0];

            if(curr > prev) {
                prev = points[i][1];
                ans += 1;
            }
        }
        return ans;
    }
}
