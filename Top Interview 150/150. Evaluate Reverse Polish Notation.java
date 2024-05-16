// 150. Evaluate Reverse Polish Notation

//   Example 1:

// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9
// Example 2:

// Input: tokens = ["4","13","5","/","+"]
// Output: 6
// Explanation: (4 + (13 / 5)) = 6

// solution

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        String operators = "+-*/";

        for(String token : tokens) {

            if(operators.indexOf(token) != -1) {

                int a = stack.pop();
                int b = stack.pop();
                int res = 0;

                if(token.equals("+")) {
                    res = b + a;
                }
                else if(token.equals("-")) {
                    res = b - a;
                }
                else if(token.equals("*")) {
                    res = b * a;
                }
                else if(token.equals("/")) {
                    res = b / a;
                }
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
