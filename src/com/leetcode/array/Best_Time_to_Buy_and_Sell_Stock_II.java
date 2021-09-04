package com.leetcode.array;

/**
 * @author prateek.bangre on 07/07/21.
 * @Project DataStructure_Algorithms
 */
/*
url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 */
public class Best_Time_to_Buy_and_Sell_Stock_II {

    /*For any given day, if the price is greater than the previous day, we sell it. If the price rises consecutively, then the cumulative addition will automatically reflect in the profit.
For example, 5, 6, 7: The first purchase at 5, and then selling at 7 is equivalent to purchase at 5 and selling at 6, and buying at 6 and again selling at 7. So, 1+1=2 will be the profit. You can take more examples to verify this.
Now in case of a dip, we already sold off our stock at the previous high since we use the greedy approach. Now, as the price has dropped, we again consider the latest price as the purchase price to check for profit later. If there is a rise, we sell again. If there is another drop, we didn't buy at the first drop, and are buying at the latest dip.
    */
    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length<2)
            return 0;

        int profit = 0;
        for (int i=1; i<prices.length; ++i){
            if (prices[i-1] < prices[i]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
//        int[] prices = new int[]{7,1,5,3,6,4};      //profit=7
        int[] prices = new int[]{1,2,3,4,5};      //profit=4
//        int[] prices = new int[]{7,6,4,3,1};      //profit=0

        System.out.println(maxProfit(prices));
    }
}
