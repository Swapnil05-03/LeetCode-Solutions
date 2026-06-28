class Solution {
    public int minInsertions(String s) {
        return s.length() - LPS(s);
    }
    public int LPS(String s) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        return LCS(a , b);
    }
    public int LCS(StringBuilder a, StringBuilder b) {
        int m = a.length() , n = b.length();
        int[][] dp = new int[m][n];
        for(int i =0 ; i< m; i++)
            for(int j =0; j < n ; j++) dp[i][j] = -1; // -1 means unvisited
        return lcs(m-1 , n-1 , a , b , dp); 
    }
    public int lcs(int i , int j , StringBuilder a , StringBuilder b , int[][] dp){
        if(i < 0 || j < 0) return 0; //there is nothing in common
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j] = 1 + lcs(i-1 , j-1 , a , b , dp);
        else return dp[i][j] = Math.max(lcs(i-1 , j , a , b , dp) , lcs(i , j-1 , a , b , dp)); 
    }
}