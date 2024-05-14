// 56. Merge Intervals

//   Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.

// solution

class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals , (arr1 , arr2) -> Integer.compare(arr1[0] , arr2[0]));

        List<int[]> output = new ArrayList<>();

        int currInterval[] = intervals[0];
        output.add(currInterval);

        for(int[] interval : intervals) {

            int currBegin = currInterval[0];
            int currEnd = currInterval[1];
            
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currEnd >= nextBegin) {
                currInterval[1] = Math.max(currEnd , nextEnd);
            }
            else {
                currInterval = interval;
                output.add(currInterval);
            }
        }

        return output.toArray(new int[output.size()][]);
    }
}
