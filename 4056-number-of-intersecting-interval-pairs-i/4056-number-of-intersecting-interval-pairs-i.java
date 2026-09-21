class Solution {
    public int countIntersectingIntervals(int[][] arr) {
        int n = arr.length;
        int count = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i][0] <= arr[j][1] && arr[j][0] <= arr[i][1])
                    count++;
            }
        }
        return count;
    }
}