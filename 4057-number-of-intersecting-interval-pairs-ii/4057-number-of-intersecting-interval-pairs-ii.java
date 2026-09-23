class Solution {
    public long countIntersectingIntervals(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr , (a,b) -> a[0] - b[0]);
        int[] ends = new int[n];
        for(int i = 0; i < n; i++){
            ends[i] = arr[i][1];
        }
        Arrays.sort(ends);
        long count = 0;
        for(int i = 0; i < n; i++){
            int start = arr[i][0];
            int nonInt = lb(ends , start); //nonIntersecting
            count += i - nonInt;
        }
        return count;
    }
    private int lb(int[] arr , int target){
        int l = 0;
        int r = arr.length;
        while(l < r){
            int mid = l + (r - l)/2;
            if(arr[mid] < target){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}