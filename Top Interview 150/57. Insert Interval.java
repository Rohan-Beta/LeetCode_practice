// 57. Insert Interval

//   Example 1:

// Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
// Output: [[1,5],[6,9]]
// Example 2:

// Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
// Output: [[1,2],[3,10],[12,16]]
// Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

// solution

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int n = intervals.length;
        int i = 0;

        List<int[]> output = new ArrayList<>();

        while(i < n && intervals[i][1] < newInterval[0]) {
            output.add(intervals[i++]);
        }
        while(i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0] , intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);

            i += 1;
        }
        output.add(newInterval);

        while(i < n) {
            output.add(intervals[i++]);
        }

        return output.toArray(new int[output.size()][]);
    }
}
