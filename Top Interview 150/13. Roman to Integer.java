// 13. Roman to Integer

//   Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// Example 2:

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 3:

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

// solution

class Solution {
    public int value(char r) {

        if(r == 'I') {
            return 1;
        }
        if(r == 'V') {
            return 5;
        }
        if(r == 'X') {
            return 10;
        }
        if(r == 'L') {
            return 50;
        }
        if(r == 'C') {
            return 100;
        }
        if(r == 'D') {
            return 500;
        }
        if(r == 'M') {
            return 1000;
        }
        return -1;
    }

    public int romanToInt(String s) {
        int total = 0;

        for(int i = 0; i < s.length(); i += 1) {
            int s1 = value(s.charAt(i));

            if(i+1 < s.length()) {
                int s2 = value(s.charAt(i+1));

                if(s1 >= s2) {
                    total = total + s1;
                }
                else {
                    total = total - s1;
                }
            }
            else {
                total = total + s1;
            }
        }
        return total;
    }
}
