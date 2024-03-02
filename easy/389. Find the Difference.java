// 389. Find the Difference

//   Example 1:

// Input: s = "abcd", t = "abcde"
// Output: "e"
// Explanation: 'e' is the letter that was added.
// Example 2:

// Input: s = "", t = "y"
// Output: "y"

// solution

class Solution {
    public char findTheDifference(String s, String t) {
        
        int count[] = new int[26];

        for(char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray()) {
            if(count[ch - 'a'] == 0) {
                return ch;
            }
            count[ch - 'a']--;
        }
        return ' ';
    }
}
