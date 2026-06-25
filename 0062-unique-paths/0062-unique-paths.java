//Method 1 -> Memoization(Recursion + DP Array)
// class Solution {
//     static int[][] dp;
//     public int uniquePaths(int m, int n) {
//         dp = new int[m+1][n+1]; //rows -> 0 to m and cols -> 0 to n
//         return paths(m , n);
//     }
//     public int paths(int m , int n){ //m to 1 and n to 1
//         if(m == 1 || n == 1) return 1;
//         if(dp[m][n] != 0) return dp[m][n];
//         return dp[m][n] = paths(m-1 , n)  + paths(m , n-1);
//     }
// }

//declaration of global variable is not considered good in the interviews so above solution can do without using global variable as given below

// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m+1][n+1]; //rows -> 0 to m and cols -> 0 to n
//         return paths(m , n , dp);
//     }
//     public int paths(int m , int n , int[][] dp){ //m to 1 and n to 1
//         if(m == 1 || n == 1) return 1;
//         if(dp[m][n] != 0) return dp[m][n];
//         return dp[m][n] = paths(m-1 , n , dp)  + paths(m , n-1 , dp);
//     }
// }

//Method 2 -> Tabulation
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m+1][n+1];
//         for(int i = 1; i<= m; i++){
//             for(int j = 1; j <= n; j++){
//                 if(i == 1 || j == 1) dp[i][j] = 1;
//                 else dp[i][j] = dp[i-1][j] + dp[i][j-1];
//             }
//         }
//         return dp[m][n];
//     }
// }

//Method 3 -> Space Optimization
//Space Optimization
// class Solution {
//     public int uniquePaths(int m, int n) {
//         if(m==1 || n==1) return 1;
//         int[][] dp = new int[2][n];
//         for(int j=0; j < n; j++){ // filling 0th row with 1
//             dp[0][j] = 1;
//         }
//         dp[1][0] =1;
//         for(int i =1; i < m; i++){
//             //filling last row
//             for(int j =1; j <n; j++){
//                 dp[1][j] = dp[1][j-1] + dp[0][j];
//             }
//             //copying first row to 0th row
//             for(int j =1; j<n; j++){
//                 dp[0][j] = dp[1][j];
//             }
//         }
//         return dp[1][n-1];
//     }
// }

//OR

class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        int[][] dp = new int[2][n];
        for(int j=0; j < n; j++){ // filling 0th row with 1
            dp[0][j] = 1;
        }
        dp[1][0] =1;
        
        for(int i =1; i < m; i++){
            if(i % 2 == 1){
                //filling last row
                for(int j =1; j <n; j++){
                    dp[1][j] = dp[1][j-1] + dp[0][j];
                }   
            }
            else{
                for(int j =1; j <n; j++){
                    dp[0][j] = dp[0][j-1] + dp[1][j];
                } 
            }
        }
        return Math.max(dp[0][n-1] , dp[1][n-1]);
    }
}
