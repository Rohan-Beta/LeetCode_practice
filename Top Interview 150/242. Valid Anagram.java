// 242. Valid Anagram

//   Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

// solution

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int charCount[] = new int[26];

        for(int i = 0; i < s.length(); i += 1) {

            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        for(int count : charCount) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
