class Solution {
    public int maxProfit(int[] prices) {
        int curmin = prices[0];
        int maxdiff = 0;
        for(int idx=1; idx<prices.length; idx++) {
            if(prices[idx] < curmin) {
                curmin = prices[idx];
            }
            else{
                maxdiff = Integer.max(maxdiff, prices[idx]-curmin);         
            }
        }
        return maxdiff;
    }
}
