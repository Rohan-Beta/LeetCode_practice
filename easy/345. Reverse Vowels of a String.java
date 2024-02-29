// 345. Reverse Vowels of a String

//   Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"

// solution

class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> vowels = new HashSet<>();

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char ch[] = s.toCharArray();

        int l = 0;
        int h = s.length() - 1;

        while(l < h) {
            while(l < h && !vowels.contains(ch[l])) {
                l += 1;
            }
            while(l < h && !vowels.contains(ch[h])) {
                h -= 1;
            }
            char temp = ch[l];
            ch[l++] = ch[h];
            ch[h--] = temp;
        }
        return new String(ch);
    }
}
