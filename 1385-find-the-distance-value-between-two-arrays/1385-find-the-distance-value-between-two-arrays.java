class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = arr1.length;
        int n = arr2.length;

        int count = 0;
        for(int i = 0; i < m; i++){
            int var = arr1[i];
            for(int j = 0; j < n; j++){
                if(Math.abs(var - arr2[j]) <= d){
                    count -= 1;
                    break;
                }
            }
        }
        return m+count;
    }
}