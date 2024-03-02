// 415. Add Strings

//   Example 1:

// Input: num1 = "11", num2 = "123"
// Output: "134"
// Example 2:

// Input: num1 = "456", num2 = "77"
// Output: "533"
// Example 3:

// Input: num1 = "0", num2 = "0"
// Output: "0"

// solution

class Solution {
    public String addStrings(String num1, String num2) {
        
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        while(n1 >= 0 || n2 >= 0 || sum > 0) {

            if(n1 >= 0) {
                sum += num1.charAt(n1) - '0';
                n1--;
            }
            if(n2 >= 0) {
                sum += num2.charAt(n2) - '0';
                n2--;
            }
            sb.append(sum % 10);
            sum /= 10;
        }
        return sb.reverse().toString();
    }
}
