// 463. Island Perimeter

//   Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
// Output: 16
// Explanation: The perimeter is the 16 yellow stripes in the image above.
// Example 2:

// Input: grid = [[1]]
// Output: 4
// Example 3:

// Input: grid = [[1,0]]
// Output: 4

// solution

class Solution {
    public int islandPerimeter(int[][] grid) {

        if(grid.length == 0) {
            return 0;
        }
        int ans = 0;

        for(int i = 0; i < grid.length; i += 1) {
            for(int j = 0; j < grid[i].length; j += 1) {

                if(grid[i][j] == 1) {
                    ans += 4;

                    if(i > 0 && grid[i-1][j] == 1) {
                        ans -= 2;
                    }
                    if(j > 0 && grid[i][j-1] == 1) {
                        ans -= 2;
                    }
                }
            }
        }
        return ans;
    }
}
