// 1137. N-th Tribonacci Number

//   Example 1:

// Input: n = 4
// Output: 4
// Explanation:
// T_3 = 0 + 1 + 1 = 2
// T_4 = 1 + 1 + 2 = 4
// Example 2:

// Input: n = 25
// Output: 1389537

// solution

class Solution {
    public int tribonacci(int n) {

        int arr[] = {0 , 1 , 1};

        if(n < 3) {
            return arr[n];
        }
        for(int i = 3; i <= n; i += 1) {
            int next = arr[0] + arr[1] + arr[2];

            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = next;
        }
        return arr[2];
    }
}
