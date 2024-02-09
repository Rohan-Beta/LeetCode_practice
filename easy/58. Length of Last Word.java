// 58. Length of Last Word

//   Example 1:

// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.
// Example 2:

// Input: s = "   fly me   to   the moon  "
// Output: 4
// Explanation: The last word is "moon" with length 4.
// Example 3:

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.

// solution

class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();
        int count = 0;

        for(int i = s.length()-1; i >= 0; i -= 1) {

            if(s.charAt(i) == ' ') {
                break;
            }
            else {
                count += 1;
            }
        }
        return count;
    }
}
