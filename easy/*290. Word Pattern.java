// 290. Word Pattern

//   Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false
// Example 3:

// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false

// solution

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String words[] = s.split(" ");

        if(words.length != pattern.length()) {
            return false;
        }
        HashMap<Character , Integer> charToIndex = new HashMap<>();
        HashMap<String , Integer> strToIndex = new HashMap<>();

        for(Integer i = 0; i < pattern.length(); i += 1) {
            if(charToIndex.put(pattern.charAt(i) , i) != strToIndex.put(words[i] , i)) {
                return false;
            }
        }
        return true;
    }
}
