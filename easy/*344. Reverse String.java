// 344. Reverse String

//   Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]

// solution

class Solution {
    public void reverseString(char[] s) {

        int l = 0;
        int h = s.length - 1;

        while(l < h) {
            char temp = s[l];
            s[l++] = s[h];
            s[h--] = temp;
        }
    }
}
