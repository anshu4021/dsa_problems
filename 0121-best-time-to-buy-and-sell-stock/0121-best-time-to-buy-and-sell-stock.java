class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit =0;
        for(int price= 0;price<prices.length;price++){
            min = Math.min(min,prices[price]);
            maxProfit = Math.max(maxProfit,prices[price]-min);
        }
        return maxProfit;
    }
}