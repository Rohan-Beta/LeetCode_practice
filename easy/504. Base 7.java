// 504. Base 7

//   Example 1:

// Input: num = 100
// Output: "202"
// Example 2:

// Input: num = -7
// Output: "-10"

// solution

class Solution {
    public String convertToBase7(int num) {
        
        if(num < 0) {
            return("-" + convertToBase7(-num));
        }
        if(num < 7) {
            return(String.valueOf(num));
        }
        return(convertToBase7(num / 7) + String.valueOf(num % 7));
    }
}
