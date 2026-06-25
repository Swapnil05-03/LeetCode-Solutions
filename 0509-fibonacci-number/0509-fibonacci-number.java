//Tabulation
// class Solution {
//     public int fib(int n) {
//         int[] dp = new int[n+1];
//         if(n>=1) dp[1] = 1; //n ==0 ke case mein dp[1] exist hi nahi krega na
//         for(int i =2; i<=n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }

//Space Optimization
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[3];
        dp[1] = 1;
        for(int i =2; i<=n; i++){
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2]; 
        }
        return dp[2];
    }
}