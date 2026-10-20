// class Solution {
//     public void reverseString(char[] s) {
//         int n = s.length;
//         int j = n-1;
//         for(int i = 0; i<n/2; i++){
//             char temp = s[i];
//             s[i] = s[j];
//             s[j] = temp;
//             j--;
//         }
//     }
// }

//OR

class Solution {
    public void reverseString(char[] s) {
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s){
            st.push(ch);
        }
        for(int i = 0; i < s.length; i++){
            s[i] = st.pop();
        }
    
    }
}