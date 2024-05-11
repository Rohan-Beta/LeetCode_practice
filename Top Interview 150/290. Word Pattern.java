// 290. Word Pattern

//   Example 1:

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Example 2:

// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false

// solution

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String words[] = s.split(" ");

        if(words.length != pattern.length()) {
            return false;
        }

        Map<Character , Integer> charIndex = new HashMap<>();
        Map<String , Integer> strIndex = new HashMap<>();

        for(Integer i = 0; i < pattern.length(); i += 1) {

            if(charIndex.put(pattern.charAt(i) , i) != strIndex.put(words[i] , i)) {
                return false;
            }
        }
        return true;
    }
}
