// 274. H-Index

//   Example 1:

// Input: citations = [3,0,6,1,5]
// Output: 3
// Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
// Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
// Example 2:

// Input: citations = [1,3,1]
// Output: 1

// solution

class Solution {
    public int hIndex(int[] citations) {

        int n = citations.length;

        int bucket[] = new int[n + 1];

        for(int c : citations) {

            if(c > n) {
                bucket[n]++;
            }
            else {
                bucket[c]++;
            }
        }
        int count = 0;

        for(int i = n; i >= 0; i -= 1) {
            count += bucket[i];

            if(count >= i) {
                return i;
            }
        }
        return 0;
    }
}
