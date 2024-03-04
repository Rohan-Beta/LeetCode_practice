// 434. Number of Segments in a String.java
  
// Example 1:

// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
// Example 2:

// Input: s = "Hello"
// Output: 1

// solution

class Solution {
    public int countSegments(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i += 1) {

            if((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count += 1;
            }
        }
        return count;
    }
}
