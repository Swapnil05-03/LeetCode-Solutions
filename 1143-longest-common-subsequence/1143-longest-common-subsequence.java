//Tabulation
class Solution {
    public int longestCommonSubsequence(String a, String b)  {
        int m = a.length() , n = b.length();
        int[][] dp = new int[m][n];
        for(int i =0 ; i< m; i++){
            for(int j =0; j < n ; j++){
                int x = (i-1 >= 0 && j-1 >=0) ? dp[i-1][j-1] : 0;
                int y = (i-1 >= 0) ? dp[i-1][j] : 0;
                int z = (j-1 >= 0) ? dp[i][j-1] : 0;
                if(a.charAt(i) == b.charAt(j)) dp[i][j] = 1 + x;
                else dp[i][j] = Math.max(y , z);
            }
        }
        return dp[m-1][n-1]; 
    }
}

//OR
//Memoization
// class Solution {
//     public int longestCommonSubsequence(String a, String b) {
//         int m = a.length() , n = b.length();
//         int[][] dp = new int[m][n];
//         for(int i =0 ; i< m; i++)
//             for(int j =0; j < n ; j++) dp[i][j] = -1; // -1 means unvisited
//         return lcs(m-1 , n-1 , a , b , dp); 
//     }
//     public int lcs(int i , int j , String a , String b , int[][] dp){
//         if(i < 0 || j < 0) return 0; //there is nothing in common
//         if(dp[i][j] != -1) return dp[i][j];
//         if(a.charAt(i) == b.charAt(j)) return dp[i][j] = 1 + lcs(i-1 , j-1 , a , b , dp);
//         else return dp[i][j] = Math.max(lcs(i-1 , j , a , b , dp) , lcs(i , j-1 , a , b , dp)); 
//     }
// }