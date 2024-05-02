// 167. Two Sum II - Input Array Is Sorted

//   Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
// Example 2:

// Input: numbers = [2,3,4], target = 6
// Output: [1,3]
// Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

// solution

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length - 1;

        while(numbers[l] + numbers[r] != target) {

            if(numbers[l] + numbers[r] < target) {
                l += 1;
            }
            else {
                r -= 1;
            }
        }
        int ans[] = {l+1 , r+1};
        return ans;
    }
}
