class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        return helper(0 , target , arr);
    }
    public int helper(int i , int target , int[] arr){
        if(i == arr.length){
            if(target == 0) return 1; // 1 valid way
            else return 0;
        }
        int add = helper(i+1 , target-arr[i] , arr);
        int subtract = helper(i+1 , target+arr[i] , arr);
        return add + subtract;
    }
}