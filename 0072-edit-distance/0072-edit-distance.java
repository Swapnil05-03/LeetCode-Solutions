//Tabulation
class Solution {
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Base cases
        for (int i = 0; i <= m; i++)
            dp[i][0] = i;

        for (int j = 0; j <= n; j++)
            dp[0][j] = j;

        // Fill DP
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {

                    int replace = 1 + dp[i - 1][j - 1];
                    int remove = 1 + dp[i - 1][j];
                    int insert = 1 + dp[i][j - 1];

                    dp[i][j] = Math.min(replace, Math.min(remove, insert));
                }
            }
        }

        return dp[m][n];
    }
}

//OR
//Memoization
// class Solution {
//     public int minDistance(String s1, String s2) {
//         int m = s1.length() , n = s2.length();
//         int[][] dp = new int[m][n];
//         for (int i = 0; i < dp.length; i++) {
//             Arrays.fill(dp[i], -1);
//         }
//         return edit(m-1 , n-1 , new StringBuilder(s1) , new StringBuilder(s2) , dp);
//     }
//     // i -> m-1 to 0 and j -> n-1 to 0
//     public int edit(int i , int j ,StringBuilder s1 , StringBuilder s2 , int[][] dp){
//         if(i < 0) return j+1; //inserting remaining characters of s2
//         if(j < 0) return i+1; //remove extra characters of s1
//         if(dp[i][j] != -1) return dp[i][j];
//         if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = edit(i-1 , j-1 , s1 , s2 , dp);
//         int replace = 1 + edit(i-1 , j-1 , s1 , s2 , dp);
//         int remove = 1 + edit(i-1 , j , s1 , s2 , dp);
//         int insert = 1 + edit(i , j-1 , s1 , s2 , dp);
//         return dp[i][j] = Math.min(replace , Math.min(remove , insert));
//     }
// }

//OR
//Recursive Solution
// class Solution {
//     public int editDistance(String s1, String s2) {
//         int m = s1.length() , n = s2.length();
//         return edit(m-1 , n-1 , new StringBuilder(s1) , new StringBuilder(s2));
//     }
//     public int edit(int i , int j ,StringBuilder s1 , StringBuilder s2){
//         if(i < 0) return j+1; //inserting remaining characters of s2
//         if(j < 0) return i+1; //remove extra characters of s1
//         if(s1.charAt(i) == s2.charAt(j)) return edit(i-1 , j-1 , s1 , s2);
//         int replace = 1 + edit(i-1 , j-1 , s1 , s2);
//         int remove = 1 + edit(i-1 , j , s1 , s2);
//         int insert = 1 + edit(i , j-1 , s1 , s2);
//         return Math.min(replace , Math.min(remove , insert));
//     }
// }