// class Solution {
//     public boolean isValid(String s) {
//         int n = s.length();
//         if(n%2 == 1) return false;
//         Stack<Character> st = new Stack<>();
//         for(int i = 0; i < n; i++){
//             char ch = s.charAt(i);
//             if(ch == '(' || ch == '[' || ch == '{') st.push(ch);
//             else{ // if ch is closing bracket
//                 if(st.size() == 0) return false;
//                 char top = st.peek();
//                 if(sameStyle(top , ch)) st.pop();
//                 else return false; 
//             }
//         }
//         return (st.size() == 0);
//     }
//     public boolean sameStyle(char a , char b){
//         if(a == '(' && b == ')') return true;
//         if(a == '[' && b == ']') return true;
//         if(a == '{' && b == '}') return true;
//         return false;
//     }
// }

//OR

class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 == 1) return false;
        Deque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top =  st.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        return st.isEmpty();
    }
}