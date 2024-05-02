// 11. Container With Most Water

//   Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1

// solution

class Solution {
    public int maxArea(int[] height) {
        
        int res = 0;

        int l = 0;
        int r = height.length - 1;

        while(l < r) {
            
            int area = (r - l) * Math.min(height[l] , height[r]);
            res = Math.max(res , area);

            if(height[l] < height[r]) {
                l += 1;
            }
            else {
                r -= 1;
            }
        }
        return res;
    }
}
