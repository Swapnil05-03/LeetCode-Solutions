//T.C --> O(N^2)
// class Solution {
//     public int[] dailyTemperatures(int[] temp) {
//         int n = temp.length;
//         int ans[] = new int[n];
//         for(int i = 0; i< n; i++){
//             for(int j = i+1; j<n; j++){
//                 if(temp[i]<temp[j]){
//                     int idx = j-i;
//                     ans[i] = idx;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }

//T.C --> O(N)
class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}