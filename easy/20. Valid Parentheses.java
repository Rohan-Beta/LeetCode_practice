// 20. Valid Parentheses

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false

// solution

class Solution {
    public boolean isValid(String s) {

        Stack<Character> leftSide = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                leftSide.push(ch);
            }
            else if(ch == ')' && !leftSide.isEmpty() && leftSide.peek() == '(') {
                leftSide.pop();
            }
            else if(ch == '}' && !leftSide.isEmpty() && leftSide.peek() == '{') {
                leftSide.pop();
            }
            else if(ch == ']' && !leftSide.isEmpty() && leftSide.peek() == '[') {
                leftSide.pop();
            }
            else {
                return false;
            }
        }
        return leftSide.isEmpty();
    }
}
