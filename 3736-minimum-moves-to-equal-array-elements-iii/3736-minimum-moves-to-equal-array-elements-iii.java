class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = 0 , op = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > max) max = nums[i];
        }
        for(int i = 0; i < n; i++){
            int diff = max - nums[i];
            op += diff;
        }
        return op;
    }
}