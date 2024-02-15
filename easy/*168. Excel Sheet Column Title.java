// 168. Excel Sheet Column Title

//   Example 1:

// Input: columnNumber = 1
// Output: "A"
// Example 2:

// Input: columnNumber = 28
// Output: "AB"
// Example 3:

// Input: columnNumber = 701
// Output: "ZY"

// solution

class Solution {
    public String convertToTitle(int columnNumber) {
        return (columnNumber == 0 ? "" : convertToTitle((columnNumber - 1) / 26) + (char) ('A' + ((columnNumber - 1) % 26)));
    }
}
