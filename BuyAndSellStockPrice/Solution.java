package BuyAndSellStockPrice;
/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/

public class Solution {
    public static int maxProfit(int[] prices) {
        int currentMaxProfit = 0;
        int currentSmallest = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0; i < prices.length; i++) { // start iterating to each element of array
            if(prices[i] < currentSmallest) 
                currentSmallest = prices[i]; //if the current element is the smallest element yet known, mark it as current smallerst element
            if(prices[i] > currentSmallest && prices[i] - currentSmallest > currentMaxProfit){
                currentMaxProfit = prices[i] - currentSmallest; // subtracting the current price with the ssmallest stock price
            }
        }
        return currentMaxProfit;    
    }

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
