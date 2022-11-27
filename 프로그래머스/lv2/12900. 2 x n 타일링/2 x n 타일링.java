class Solution {
    public int solution(int n) {
        int[] dp = new int[n+1];
        
        for (int i = 1; i <=n; i++) {
            if (i <= 2) dp[i] = i;
            else dp[i] = (dp[i - 2] + dp[i - 1]) % 1000000007;
        }
        
        return dp[n];
    }
}