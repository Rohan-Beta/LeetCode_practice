// 121. Best Time to Buy and Sell Stock

//   Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.

// solution

class Solution {
    public int maxProfit(int[] prices) {

        int buy = 0;
        int sell = 1;

        int maxProfit = 0;

        while(sell < prices.length) {
            if(prices[buy] < prices[sell]) {

                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit , profit);
            }
            else {
                buy = sell;
            }
            sell += 1;
        }
        return maxProfit;
    }
}
