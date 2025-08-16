class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // new best buy day
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // profit if sell today
            }
        }
        return maxProfit;
    }
}