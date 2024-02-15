// 171. Excel Sheet Column Number

//   For example:

// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28 
// ...
 

// Example 1:

// Input: columnTitle = "A"
// Output: 1
// Example 2:

// Input: columnTitle = "AB"
// Output: 28
// Example 3:

// Input: columnTitle = "ZY"
// Output: 701

// solution

class Solution {
    public int titleToNumber(String columnTitle) {

        int ans = 0;

        for(char c : columnTitle.toCharArray()) {
            ans = ans * 26 + c - '@';
        }
        return ans;
    }
}
