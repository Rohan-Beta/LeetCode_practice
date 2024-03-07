// 506. Relative Ranks

//   Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
// Example 2:

// Input: score = [10,3,8,9,4]
// Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
// Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

// solution

class Solution {
    public String[] findRelativeRanks(int[] score) {

        HashMap<Integer , Integer> map = new HashMap<>();
        int temp[] = score.clone();

        Arrays.sort(temp);

        for(int i = 0; i < temp.length; i += 1) {
            map.put(temp[i] , temp.length - i);
        }
        String ans[] = new String[score.length];

        for(int i = 0; i < ans.length; i += 1) {

            int rank = map.get(score[i]);
            String rankStr = rank + "";

            if(rank == 1) {
                ans[i] = "Gold Medal";
            }
            else if(rank == 2) {
                ans[i] = "Silver Medal";
            }
            else if(rank == 3) {
                ans[i] = "Bronze Medal";
            }
            else {
                ans[i] = rankStr;
            }
        }
        return ans;
    }
}
