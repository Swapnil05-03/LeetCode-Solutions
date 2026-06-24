class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1]; //rows -> 0 to m and cols -> 0 to n
        return paths(m , n);
    }
    public int paths(int m , int n){ //m to 1 and n to 1
        if(m == 1 || n == 1) return 1;
        if(dp[m][n] != 0) return dp[m][n];
        return dp[m][n] = paths(m-1 , n)  + paths(m , n-1);
    }
}