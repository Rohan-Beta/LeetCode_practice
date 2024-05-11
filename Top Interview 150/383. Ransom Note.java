// 383. Ransom Note

//   Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// solution

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int charCount[] = new int[26];

        for(char ch : magazine.toCharArray()) {
            charCount[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()) {
            charCount[ch - 'a']--;

            if(charCount[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
