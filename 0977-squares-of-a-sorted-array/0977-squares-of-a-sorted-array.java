class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int pos = 0, neg = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] >= 0) pos++;
            else neg++;
        }
        int[] positive = new int[pos];
        int[] negative = new int[neg];

        int p = 0, ne = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] >= 0){
                positive[p++] = nums[i];
            } else {
                negative[ne++] = nums[i];
            }
        }
        for(int i = 0; i < pos; i++){
            positive[i] = positive[i] * positive[i];
        }

        for(int i = 0; i < neg; i++){
            negative[i] = negative[i] * negative[i];
        }
        for(int i = 0, j = neg - 1; i < j; i++, j--){
            int temp = negative[i]; 
            negative[i] = negative[j]; 
            negative[j] = temp; 
        }
        int i = 0, j = 0, k = 0;           
        int[] result = new int[n];

        while(i < pos && j < neg){
            if(positive[i] < negative[j]){
                result[k++] = positive[i++];
            } else {
                result[k++] = negative[j++];
            }
        }
        while(i < pos){
            result[k++] = positive[i++];
        }
        while(j < neg){
            result[k++] = negative[j++];
        }

        return result;
    }
}