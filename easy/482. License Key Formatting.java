// 482. License Key Formatting

//   Example 1:

// Input: s = "5F3Z-2e-9-w", k = 4
// Output: "5F3Z-2E9W"
// Explanation: The string s has been split into two parts, each part has 4 characters.
// Note that the two extra dashes are not needed and can be removed.
// Example 2:

// Input: s = "2-5g-3-J", k = 2
// Output: "2-5G-3J"
// Explanation: The string s has been split into three parts, each part has 2 characters except the first part as it could be shorter as mentioned above.

// solution

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        s = s.toUpperCase();
        s = s.replaceAll("-" , "");

        int len = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i -= 1) {

            if(len > 0 && len % k == 0) {
                sb.append("-");
            }
            sb.append(s.charAt(i));
            len += 1;
        }
        return sb.reverse().toString();
    }
}
