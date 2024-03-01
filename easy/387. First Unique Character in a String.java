// 387. First Unique Character in a String

//   Example 1:

// Input: s = "leetcode"
// Output: 0
// Example 2:

// Input: s = "loveleetcode"
// Output: 2
// Example 3:

// Input: s = "aabb"
// Output: -1

  // solution
  
  class Solution {
    public int firstUniqChar(String s) {

        int count[] = new int[26];

        for(char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i += 1) {
            if(count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
