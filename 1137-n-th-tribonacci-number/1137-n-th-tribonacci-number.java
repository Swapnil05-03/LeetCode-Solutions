// class Solution {
//     static int[] dp;
//     public int tribonacci(int n) {
//         dp = new int[n+1];
//         return tribo(n);
//     }
//     public int tribo(int n){
//         if(n==0 || n==1) return n;
//         if(n==2) return n-1;
//         if(dp[n] != 0) return dp[n];
//         return dp[n] = tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
//     }
// }

class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        if(n>=1) dp[1] = 1; //n ==0 ke case mein dp[1] exist hi nahi krega na
        if(n>=2) dp[2] = 1; //n ==0 ke case mein dp[1] exist hi nahi krega na
        for(int i =3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}