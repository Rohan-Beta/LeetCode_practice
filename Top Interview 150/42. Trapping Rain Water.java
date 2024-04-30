// 42. Trapping Rain Water

//   Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
// Example 2:

// Input: height = [4,2,0,3,2,5]
// Output: 9

// solution

class Solution {
    public int trap(int[] height) {

        if(height.length == 0) {
            return 0;
        }
        int res = 0;

        int l = 0;
        int r = height.length - 1;

        int leftMax = height[l];
        int rightMax = height[r];

        while(l < r) {

            if(leftMax < rightMax) {

                l += 1;
                leftMax = Math.max(leftMax , height[l]);
                res += leftMax - height[l];
            }
            else {
                r -= 1;
                rightMax = Math.max(rightMax , height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
