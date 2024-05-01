// 2000. Reverse Prefix of Word

//   Example 1:

// Input: word = "abcdefd", ch = "d"
// Output: "dcbaefd"
// Explanation: The first occurrence of "d" is at index 3. 
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
// Example 2:

// Input: word = "xyxzxe", ch = "z"
// Output: "zxyxxe"
// Explanation: The first and only occurrence of "z" is at index 3.
// Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".

// solution

class Solution {
    public String reversePrefix(String word, char ch) {

        int start = 0;
        int end = -1;

        for(int i = 0; i < word.length(); i += 1) {

            if(word.charAt(i) == ch) {
                end = i;
                break;
            }
        }
        if(end < 0) {
            return word;
        }
        char strArray[] = word.toCharArray();

        while(start < end) {
            
            char temp = strArray[start];
            strArray[start] = strArray[end];
            strArray[end] = temp;

            start += 1;
            end -= 1;
        }
        return new String(strArray);
    }
}
