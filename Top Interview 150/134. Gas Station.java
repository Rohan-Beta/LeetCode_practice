// 134. Gas Station

//   Example 1:

// Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
// Output: 3
// Explanation:
// Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
// Travel to station 4. Your tank = 4 - 1 + 5 = 8
// Travel to station 0. Your tank = 8 - 2 + 1 = 7
// Travel to station 1. Your tank = 7 - 3 + 2 = 6
// Travel to station 2. Your tank = 6 - 4 + 3 = 5
// Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
// Therefore, return 3 as the starting index.
// Example 2:

// Input: gas = [2,3,4], cost = [3,4,3]
// Output: -1
// Explanation:
// You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
// Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
// Travel to station 0. Your tank = 4 - 3 + 2 = 3
// Travel to station 1. Your tank = 3 - 3 + 3 = 3
// You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
// Therefore, you can't travel around the circuit once no matter where you start.

// solution

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        if(gas.length != cost.length) {
            return -1;
        }
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < gas.length; i += 1) {

            sum1 += gas[i];
            sum2 += cost[i];
        }
        if(sum1 < sum2) {
            return -1;
        }

        int total = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i += 1) {
            total += gas[i] - cost[i];

            if(total < 0) {

                total = 0;
                start = i + 1;
            }
        }
        return start;
    }
}
