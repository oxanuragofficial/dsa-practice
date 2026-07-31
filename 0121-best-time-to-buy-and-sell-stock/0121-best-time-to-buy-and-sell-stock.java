class Solution {
    public int maxProfit(int[] prices) {
        // Handle edge case for empty or single-day arrays
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the lowest purchase price seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate potential profit and update maxProfit if it's higher
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}
