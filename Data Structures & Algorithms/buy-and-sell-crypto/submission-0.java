class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        int precompute[] = new int[n];
        precompute[n - 1] = prices[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            precompute[i] = Math.max(prices[i], precompute[i + 1]);
        }

        int ans = -1;


        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, precompute[i] - prices[i]);
        }

        return ans;


    }
}
