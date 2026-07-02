//Binary Search on Answer
class Solution {
    public int lengthOfLIS(int arr[])  {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : arr){
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele , ans);
        }
        return ans.size();
    }
    public void replace(int ele , ArrayList<Integer> ans){
        int lo = 0 , hi = ans.size()-1 , lb = -1; //replace with lower bound
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans.set(lb , ele);
    }
}

//OR
//Tabulation
// class Solution {
//     public int lengthOfLIS(int[] arr) {
//         int n = arr.length;
//         int[] dp = new int[n];
//         Arrays.fill(dp , 1);
//         int maxLen = 1;
//         for(int i = 1 ; i < n; i++){
//             int max = 0;
//             for(int j = 0 ; j < i; j++){
//                 if(arr[j] < arr[i]){
//                     max = Math.max(max , dp[j]);
//                 }
//             }
//             dp[i] += max;
//             maxLen = Math.max(maxLen , dp[i]);
//         }
//         return maxLen;
//     }
// }

//OR
// //Memoization
// class Solution {
//     public int lengthOfLIS(int[] arr) {
//         int n = arr.length;
//         int[][] dp = new int[n][n+1];
//         for(int i = 0 ; i < n; i++)
//             for(int j = 0 ; j < n; j++) dp[i][j] = -1;
//         return helper(0 , -1 , arr , dp);
//     }
//     public static int helper(int idx , int prev , int[] arr , int[][] dp){
//         if(idx == arr.length) return 0;
//         if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
//         int skip = helper(idx+1 , prev , arr , dp);
//         if(prev != -1 && arr[idx] <= arr[prev]) return dp[idx][prev+1] = skip;
//         int pick = 1 + helper(idx+1 , idx , arr ,dp);
//         return dp[idx][prev+1] = Math.max(pick , skip);
//     }
// }

//OR
//Recursive Solution (TLE)
// class Solution {
//     static int lis(int arr[]) {
//         return helper(0 , -1 , arr);
//     }
//     static int helper(int idx , int prev , int[] arr){
//         if(idx == arr.length) return 0;
//         int skip = helper(idx+1 , prev , arr);
//         if(prev != -1 && arr[idx] <= arr[prev]) return skip;
//         int pick = 1 + helper(idx+1 , idx , arr);
//         return Math.max(pick , skip);
//     }
// }