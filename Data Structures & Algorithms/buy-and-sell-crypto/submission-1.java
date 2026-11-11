class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                int profit = prices[i] - min;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                min = prices[i];
            }
        }
        return maxProfit;
    }
}
