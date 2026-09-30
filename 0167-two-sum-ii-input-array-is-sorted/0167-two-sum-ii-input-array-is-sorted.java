class Solution {
    public int[] twoSum(int[] arr, int t) {
        int n = arr.length;
        int i = 0 , j = n-1;
        int[] ans = new int[2];
        while(i != j){
            if(arr[i] + arr[j] > t) j--;
            else if(arr[i] + arr[j] < t) i++;
            else{
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
        }
        return ans;
    }
}