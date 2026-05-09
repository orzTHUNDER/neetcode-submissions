class Solution {

    int helper(int n, int cost[], int dp[]) {

        if(n == 0 || n == 1 || dp[n] != -1) return dp[n];

        dp[n] = Math.min(helper(n - 1, cost, dp) + cost[n - 1], helper(n - 2, cost, dp) + cost[n - 2]);

        return dp[n];

    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int[] dp = new int[n + 1];
        // dp[0] = 0;
        // dp[1] = 0;
        // for(int i = 2; i <=n; i++) {
        //     dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]); 
        // }
        // return dp[n];
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 0;
        return helper(cost.length, cost, dp);
    }
}
