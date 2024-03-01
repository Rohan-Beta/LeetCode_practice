// 383. Ransom Note

//   Example 1:

// Input: ransomNote = "a", magazine = "b"
// Output: false
// Example 2:

// Input: ransomNote = "aa", magazine = "ab"
// Output: false
// Example 3:

// Input: ransomNote = "aa", magazine = "aab"
// Output: true

// solution

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int count[] = new int[26];

        for(char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }
        for(char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;

            if(count[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
