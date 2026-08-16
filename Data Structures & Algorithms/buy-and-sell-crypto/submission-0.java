class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0],profit=0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int temp_profit=prices[i]-min;
            if(temp_profit>profit){
                profit=temp_profit;
            }
        }
        return profit;
    }
}
