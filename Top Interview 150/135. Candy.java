// 135. Candy

//   Example 1:

// Input: ratings = [1,0,2]
// Output: 5
// Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
// Example 2:

// Input: ratings = [1,2,2]
// Output: 4
// Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
// The third child gets 1 candy because it satisfies the above two conditions.

// solution

class Solution {
    public int candy(int[] ratings) {

        int arr[] = new int[ratings.length];

        for(int i = 0; i < ratings.length; i += 1) {
            arr[i] = 1;
        }
        for(int i = 1; i < ratings.length; i += 1) {

            if(ratings[i] > ratings[i-1]) {
                arr[i] = arr[i-1] + 1;
            }
        }
        for(int i = ratings.length-2; i >= 0; i -= 1) {

            if(ratings[i] > ratings[i+1]) {
                arr[i] = Math.max(arr[i] , arr[i+1] + 1);
            }
        }
        int sum = 0;

        for(int i = 0; i < arr.length; i += 1) {
            sum += arr[i];
        }
        return sum;
    }
}
