// 12. Integer to Roman

//   Example 1:

// Input: num = 3
// Output: "III"
// Explanation: 3 is represented as 3 ones.
// Example 2:

// Input: num = 58
// Output: "LVIII"
// Explanation: L = 50, V = 5, III = 3.

// solution

class Solution {
    public String intToRoman(int num) {

        int values[] = {1 , 4 , 5 , 9 , 10 , 40 , 50 , 90 , 100 , 400 , 500 , 900 , 1000};
        
        String symbols[] = {"I" , "IV" , "V" , "IX" , "X" , "XL" , "L" , 
                            "XC" , "C" , "CD" , "D" , "CM" , "M"};

        StringBuilder sb = new StringBuilder();

        for(int i = values.length-1; i >= 0; i -= 1) {

            if(num == 0) {
                break;
            }
            while(num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}
