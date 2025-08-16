class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=1;
        int profit=0;
        int maxprofit =0;
        while(right<prices.length)
        {
            if(prices[left]<prices[right])
            {
                profit=prices[right]-prices[left];
                if(maxprofit<profit)
                    maxprofit=profit;
            }
            else
                left=right;
            right++;
        }
        return maxprofit;
    }
}