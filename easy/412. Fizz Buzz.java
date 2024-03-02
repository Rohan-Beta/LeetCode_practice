// 412. Fizz Buzz

//   Example 1:

// Input: n = 3
// Output: ["1","2","Fizz"]
// Example 2:

// Input: n = 5
// Output: ["1","2","Fizz","4","Buzz"]
// Example 3:

// Input: n = 15
// Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

// solution

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i += 1) {
            StringBuilder sb = new StringBuilder();

            if(i % 3 == 0) {
                sb.append("Fizz");
            }
            if(i % 5 == 0) {
                sb.append("Buzz");
            }
            ans.add(sb.length() == 0? String.valueOf(i) : sb.toString());
        }
        return ans;
    }
}
