/*

COmplexity: O(n)
Difficulty: Easy
Link:https://leetcode.com/problems/climbing-stairs/


45 / 45 test cases passed.
Status: Accepted
Runtime: 0 ms
Memory Usage: 40.5 MB

Beats 100% of the solutions

*/


class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        if(n==0||n==1){
            return 1;
        }
         dp[0]= 1;
         dp[1] = 1;
        for(int i =2; i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
