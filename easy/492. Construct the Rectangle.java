// 492. Construct the Rectangle

//   Example 1:

// Input: area = 4
// Output: [2,2]
// Explanation: The target area is 4, and all the possible ways to construct it are [1,4], [2,2], [4,1]. 
// But according to requirement 2, [1,4] is illegal; according to requirement 3,  [4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
// Example 2:

// Input: area = 37
// Output: [37,1]
// Example 3:

// Input: area = 122122
// Output: [427,286]

// solution

class Solution {
    public int[] constructRectangle(int area) {

        int width = (int)Math.sqrt(area);

        while(area % width > 0) {
            width -= 1;
        }
        int ans[] = {area / width , width};

        return ans;
    }
}
