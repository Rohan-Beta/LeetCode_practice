// 205. Isomorphic Strings

//   Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false

// solution

class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character , Integer> charIndex_s = new HashMap<>();
        Map<Character , Integer> charIndex_t = new HashMap<>();

        for(Integer i = 0; i < s.length(); i += 1) {

            if(charIndex_s.put(s.charAt(i) , i) != charIndex_t.put(t.charAt(i) , i)) {
                return false;
            }
        }
        return true;
    }
}
