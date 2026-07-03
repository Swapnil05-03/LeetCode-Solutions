class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxLen = 1;
        for(int i = 0 ; i < n; i++){
            int row = 0;
            for(int col = i ; col < n; col++){
                if(row == col) dp[row][col] = 1;
                else if(s.charAt(row) == s.charAt(col)){
                    if(col == row+1) dp[row][col] = 2;
                    else if(dp[row+1][col-1] != 0) dp[row][col] = dp[row+1][col-1] + 2;
                }
                maxLen = Math.max(maxLen , dp[row][col]);
                row++;
            }
        }
        String ans = "";
        for(int i = 0; i < n; i++){
            int row = 0;
            for(int col = i; col <n; col++,row++){
                if(dp[row][col] == maxLen){
                    ans = s.substring(row , col+1);
                    return ans;
                }
            }
        }
        return ans;
    }
}


//OR
// class Solution {
//     public String longestPalindrome(String s) {
//         if (s == null || s.length() < 2) return s;
//         int i = 0, j = 0;
//         for (int k = 0; k < s.length(); k++) {
//             int len1 = longest(s, k, k);       
//             int len2 = longest(s, k, k + 1);   
//             int len = Math.max(len1, len2);

//             if (len > j - i + 1) {
//                 i = k - (len - 1) / 2;
//                 j = k + len / 2;
//             }
//         }
//         return s.substring(i, j+1);
//     }
//     private int longest(String s, int left, int right) {
//         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }
//         return right - left - 1;
//     }
// }