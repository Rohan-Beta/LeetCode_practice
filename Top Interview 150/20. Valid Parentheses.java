// 20. Valid Parentheses

//   Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true

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
