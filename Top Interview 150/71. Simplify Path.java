// 71. Simplify Path

//   Example 1:

// Input: path = "/home/"

// Output: "/home"

// Explanation:

// The trailing slash should be removed.

 
// Example 2:

// Input: path = "/home//foo/"

// Output: "/home/foo"

// Explanation:

// Multiple consecutive slashes are replaced by a single one.

// solution

class Solution {
    public String simplifyPath(String path) {

        String dirs[] = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String dir : dirs) {
            
            if(dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if(dir.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(dir);
            }
        }
        return "/" + String.join("/" , stack);
    }
}
