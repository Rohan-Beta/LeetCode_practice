// 151. Reverse Words in a String

//   Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"
// Example 2:

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

// solution

class Solution {
    public String reverseWords(String s) {

        int n = s.length();
        int i = 0;

        String result = "";

        while(i < n) {

            while(i < n && s.charAt(i) == ' ') {
                i += 1;
            }
            if(i >= n) {
                break;
            }
            int j = i+1;

            while(j < n && s.charAt(j) != ' ') {
                j += 1;
            }
            String subStr = s.substring(i , j);

            if(result.isEmpty()) {
                result = subStr;
            }
            else {
                result = subStr + " " + result;
            }
            i = j+1;
        }
        return result;
    }
}
