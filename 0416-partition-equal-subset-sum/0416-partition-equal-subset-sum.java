class Solution {
    public boolean canPartition(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int ele : arr) sum += ele;
        if(sum % 2 == 1) return false;
        int target = sum/2;
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(0 ,arr , target , dp);
    }

    public boolean helper(int i , int[] arr , int target , int[][] dp){
        if(i==arr.length) return false;
        if(target == 0) return true;
        if(dp[i][target] != -1) return (dp[i][target] == 1);

        boolean skip = helper(i+1 , arr , target , dp);
        boolean pick = false;
        if(arr[i] <= target) pick = helper(i+1 , arr , target-arr[i] , dp);

        dp[i][target] = (pick || skip) ? 1 : 0;
        return pick || skip;
    }
}