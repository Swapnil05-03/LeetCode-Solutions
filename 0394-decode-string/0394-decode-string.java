class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();

        StringBuilder sb1 = new StringBuilder();
        int num = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num* 10 + (ch - '0');
            }
            else if(ch == '['){
                st.push(num);
                str.push(sb1);
                num = 0;
                sb1 = new StringBuilder();
            }
            else if(ch == ']'){
                int x = st.pop();
                StringBuilder sb2 = str.pop();
                for(int i = 0; i < x; i++){
                    sb2.append(sb1);
                }
                sb1 = sb2;
            }
            else sb1.append(ch);
        }
        return sb1.toString();

    }
}