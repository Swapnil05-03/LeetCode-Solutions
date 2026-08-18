class Solution {
    public int maximumGap(String arr1, String arr2) {
        int n = arr1.length();
        int m = arr2.length();
        int[] left = new int[n];
        int[] right = new int[n];

        int j = 0;
        for(int i = 0; i < n; i++){
            while(arr2.charAt(j) != arr1.charAt(i)){
                j++;
            }
            left[i] = j;
            j++;
        }
        j = m-1;
        for(int i =n-1; i >= 0; i--){
            while(arr2.charAt(j) != arr1.charAt(i)){
                j--;
            }
            right[i] = j;
            j--;
        }
        int ans = 0;
        for(int i = 0; i < n-1; i++){
            ans = Math.max(ans , right[i+1] - left[i]);
        }
        return ans;
    }
}