//Memoization
class Solution {
    static int absSum;
    public int findTargetSumWays(int[] arr, int target) {
        absSum = 0;
        for(int ele : arr) absSum += Math.abs(ele);
        int[][] dp = new int[arr.length][2*absSum+1];
        return helper(0 ,0 , target , arr , dp);
    }
    public int helper(int i ,int sum , int target , int[] arr ,int[][] dp){
        if(i == arr.length){
            if(sum == target) return 1; // 1 valid way
            else return 0;
        }
        if(dp[i][sum + absSum] != 0) return dp[i][sum+absSum];
        int add = helper(i+1 , sum + arr[i], target , arr , dp);
        int subtract = helper(i+1 , sum - arr[i] , target , arr , dp);
        return dp[i][sum+absSum] = add + subtract;
    }
}

//OR

//Recursive Way
// class Solution {
//     public int findTargetSumWays(int[] arr, int target) {
//         return helper(0 , target , arr);
//     }
//     public int helper(int i , int target , int[] arr){
//         if(i == arr.length){
//             if(target == 0) return 1; // 1 valid way
//             else return 0;
//         }
//         int add = helper(i+1 , target-arr[i] , arr);
//         int subtract = helper(i+1 , target+arr[i] , arr);
//         return add + subtract;
//     }
// }